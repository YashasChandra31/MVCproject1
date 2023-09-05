package DatabaseConfig.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // This will return the login form view (login.jsp)
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Implement user authentication logic here
        // You can use Spring Security or custom authentication logic

        // For now, let's assume a simple check
        if (username.equals("student1") && password.equals("password1")) {
            return "redirect:/student/dashboard"; // Redirect to the student dashboard
        } else if (username.equals("teacher1") && password.equals("password2")) {
            return "redirect:/teacher/dashboard"; // Redirect to the teacher dashboard
        } else {
            model.addAttribute("error", "Invalid username or password"); // Add an error message to the model
            return "login"; // Login failed, return to the login page
        }
    }
}
