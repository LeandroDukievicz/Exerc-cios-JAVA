

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/calculokm"})
public class calculokm extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                String carro = "";
                carro = request.getParameter("modeloCarro");       

                Double total,totalAcrescimo, parcialRevisao, parcialPneus,parcialMedia;

                Double Combust  = Double.valueOf(request.getParameter("combustivel"));

                Double mediakm = Double.valueOf(request.getParameter("rendimento"));

                Double custoRevisao = Double.valueOf(request.getParameter("revisao"));

                Double custoPneu = Double.valueOf(request.getParameter("pneus"));

                parcialRevisao = custoRevisao / 10000;

                parcialPneus = custoPneu / 50000;

                parcialMedia = Combust / mediakm; 

                total = parcialMedia+parcialRevisao+parcialPneus;

                totalAcrescimo = total + total *0.15;
                
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
         
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel = 'stylesheet' href='./servlet.css'>");
            out.println("<title>Resultado do Cálculo</title>");            
            out.println("</head>");
            out.println("<body>");
                    out.println("<section>");
                    out.println("<h1 style:  font-family: Verdana, Geneva color: #607D8B; >  Cálculo Km Rodado  </h1>");
                    out.println("</section>");            
                    out.println("<section>");
                    out.println("<h2>  Segue Resultado para o modelo :<i>"+  carro + "</i></h2>"  );
                    out.println("</section>");
                    
                    out.println("<main>");
                            out.println("<div>");
                            out.println("<p><strong> Valores Informados para Cálculo:</strong>  </p> ");
                            out.println("<p> Preço  do Combustível  R$/litro : "+  Combust +  "  </p> ");
                            out.println("<p> Autonomia do Veículo   KM/Litro : "+  mediakm +  "  </p> ");
                            out.println("<p> Custo de Revisão à cada 10.000 KM : "+  custoRevisao +  "  </p> ");
                            out.println("<p> Custo dos Pneus  à cada 50.000 KM : "+  custoPneu +  "  </p> ");
                            out.println("</div>");       
                            out.println("<div>");
                            out.println("<p><strong> TOTAL:</strong>  </p> ");            
                            out.println("<p> Valor do KM rodado R$: "+  total +  "  </p> ");
                            out.println("<p> Acréscimo de 15%  R$: "+  totalAcrescimo +  "  </p> ");
                            out.println("</div>");
                            out.println("<button>");
                            out.println("<a href ='./index.html'><strong>Fazer Novo Cálculo ");
                            out.println("</strong></a>");
                            out.println("</button>");                  
                    out.println("</main>");
            out.println("</body>");
            
            out.println("<footer>");
                    out.println("<h4>Desenvolvido por Leandro Dukiévicz - RA 21144207-5</h4>");
            out.println("</footer>");
        
            
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
