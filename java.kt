
import jdk.internal.org.jline.utils.Colors.s
import jdk.internal.org.jline.utils.Colors.s





class java {
    package demotest;

    import java.io.IOException;

    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;

    /**
     * Servlet implementation class FluxKart
     */
    public class FluxKart extends HttpServlet {
        private static final long serialVersionUID = 1L;


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            String id = request.getParameter("id");
            String email= request.getParameter("email");
            String phone_Number = request.getParameter("phone_Number");
            String linkedid= request.getParameter("linkedid");
            String createdAt = request.getParameter("createdAt");
            String updatedAt  = request.getParameter("updatedAt ");
            String  deletedAt = request.getParameter(" deletedAt ");

                    if(id.isEmpty() || email.isEmpty() || phone_Number.isEmpty() ||
                linkedid.isEmpty() || createdAt.isEmpty() || updateAt.isEmpty() ||  deletedAt.isEmpty())
            {
                RequestDispatcher req = request.getRequestDispatcher("register_1.jsp");
                req.include(request, response);
            }

            else
            {
                RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
                req.forward(request, response);
            }
            if (!((linkedid.length() >= 8)
                        && (linkedid.length() <= 15))) {
                return false;
            }

            // to check space
            if (id.contains(" ")) {
                return false;
            }
            if (true) {
                int count = 0;

                // check digits from 0 to 9
                for (int i = 0; i <= 9; i++) {

                    // to convert int to string
                    String str1 = Integer.toString(i);

                    if (id.contains(str1)) {
                        count = 1;
                    }
                }
                if (count == 0) {
                    return false;
                }
                if (Colors.s == null) {
                    return false
                }
                if (s == null) {
                    return false;
                }
                if(alphabet == null){
                    return false;
                }
                for (int i = 0; i < s.length(); i++)
                {
                    char c = s.charAt(i);
                    if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                        return false;
                    }
                    val pattern: Pattern = Pattern.compile("^\\d{10}$");
                    val matcher: Matcher = pattern.matcher("2055550125");
                    assertTrue(matcher.matches());
                }
                return true;

        }
}