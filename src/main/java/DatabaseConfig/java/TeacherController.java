package DatabaseConfig.java;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    
    // Define request mapping for the teacher dashboard
    @RequestMapping("/dashboard")
    public String teacher_dashboard(Model model) {
        // Add data to the model that you want to display in the view
        model.addAttribute("message", "Welcome to the Teacher Dashboard!");
        return "teacher_dashboard"; // This is the name of the view (JSP file)
    }
}

