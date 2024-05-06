import java.io.IOException;
import jakarta.io.PrintWriter;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/armstrong")
public class NutritionalCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number = request.getParameter("number");
        
      try{
        int numbers = Integer.parseInt(number);
        
        
        int originalnumber = numbers  ;
                int reminder , result =0 ;
        
        while (originalnumber != 0 ) {
            reminder = originalnumber % 10 ;
            result += Math.pow(reminder, 3);
            // result += Math.pow(remainder, 3);
            originalnumber /= 10 ;
        }
            
        
        int finaloutput ;
        String output ;
        if (result == numbers){
         finaloutput = 1 ;
        if(finaloutput == 1 ){
            output = "the number is srmstrong number " ;
        }
        }
        
        response.setContentType("");
        response.getWriter().println();
        response.getWriter().println(output);
      
        }
        catch(NumberFormatException e ) {
            response.setContentType("");
        response.getWriter().println();
            }


        }
    }


