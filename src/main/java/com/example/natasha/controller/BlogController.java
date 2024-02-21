package com.example.natasha.controller;
import com.example.natasha.model.Post;
import com.example.natasha.repozitory.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class BlogController {
    private final PostRepository postRepository ;
    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts =postRepository.findAll();
        model.addAttribute("posts",posts);

        return "blog-main";
    }
    @GetMapping("/blog/add")
    public String blogAdd(Model model){
        return "blog-add";
    }
    @PostMapping("/blog/add")
    public String blogPostAdd(
            @RequestParam String title,//  узказываю в   <input type="text" name="title"
            @RequestParam String full_text,
            @RequestParam String anons,
            Model model){
        Post post = new Post(title,anons,full_text);
        postRepository.save(post);

        return "redirect:/blog";
    }
    @GetMapping("/blog/{id}")
    public String blogDelailsById( @PathVariable (value = "id") long id , Model model){
        if (postRepository.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post>  post =postRepository.findById(id);
        ArrayList<Post> res =new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post",post);
        return "blog-details";
    }

}
