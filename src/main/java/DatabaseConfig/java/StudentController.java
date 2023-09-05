package DatabaseConfig.java;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    // Define request mapping for the student dashboard
    @RequestMapping("/dashboard")
    public String student_dashboard(Model model) {
        // Add data to the model that you want to display in the view
        model.addAttribute("message", "Welcome to the Student Dashboard!");
        return "student_dashboard"; // This is the name of the view (JSP file)
    }
}



