package project.java5.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping({"/", "index"})
    public String getHomePage(){

        return "home";
    }

    @GetMapping("/gia-tuan")
    public String getGiaTuanPage(){
        return "gia-tuan";
    }
    @GetMapping("/huu-trong")
    public String getHuuTronggPage(){
        return "huu-trong";
    }
    @GetMapping("/dangnhap")
    public String getdangnhapPage(){
        return "dangnhap";
    }
    @GetMapping("/dangky")
    public String getdangkyPage(){
        return "dangky";
    }
    @GetMapping("/chitietsanpham")
    public String getchitietsanphamPage(){
        return "chitietsanpham";
    }
}
