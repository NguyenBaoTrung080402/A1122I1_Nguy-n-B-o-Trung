package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005fafterLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./assets/Css/home_afterLogin.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <header>\n");
      out.write("                <div class=\"header1\">\n");
      out.write("                    <img width=\"40px\" style=\"margin-top: -5px;\" src=\"./assets/IMG/logo.png\"\n");
      out.write("                         alt=\"Logo\">\n");
      out.write("                    <h1>ChunnZann</h1>\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a class=\"mau1\" href=\"\">Product</a></li> <i\n");
      out.write("                        class=\"fa-sharp fa-solid\n");
      out.write("                        fa-chevron-down\"></i>\n");
      out.write("                    <li><a class=\"mau2\" href=\"\">Learning Center</a></li><i\n");
      out.write("                        class=\"fa-sharp fa-solid\n");
      out.write("                        fa-chevron-down\"></i>\n");
      out.write("                    <li><a class=\"mau3\" href=\"\">About</a></li><i class=\"fa-sharp\n");
      out.write("                        fa-solid\n");
      out.write("                                                                     fa-chevron-down\"></i>\n");
      out.write("                    <li><a class=\"mau4\" href=\"\">Pricing</a></li>\n");
      out.write("                    <li><a class=\"mau5\" href=\"\">Watch Demo</a></li>\n");
      out.write("                    <span class=\"span1\">\n");
      out.write("                        <li><a class=\"mau6\" href=\"\">Talk To Sales</a></li>\n");
      out.write("                        <li><a class=\"mau7\" href=\"\">Login</a></li>\n");
      out.write("                        <li><a class=\"mau8\" href=\"\">Get Started</a></li>\n");
      out.write("                    </span>\n");
      out.write("                </ul>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"allBody\">\n");
      out.write("                <div class=\"body1\">\n");
      out.write("                    <div class=\"video\">\n");
      out.write("                        <video width=\"100%\" controls\n");
      out.write("                               src=\"./assets/IMG/Allvideo.mp4\"></video>\n");
      out.write("                        <i class=\"fa-sharp fa-solid fa-mobile-screen-button\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"body1Child\">\n");
      out.write("                        <h1>How did we come together? </h1>\n");
      out.write("                        <p>\n");
      out.write("                            Nếu 1 ngày nào đó em cảm thấy buồn và ko còn muốn\n");
      out.write("                            yêu a nữa thì em hãy xem cái này, kĩ thuật làm video\n");
      out.write("                            của a so vs em thì còn thua xa lắm, nhưng mà đây là\n");
      out.write("                            điều mà từ trước tới giờ a chưa từng làm cho ai cả,\n");
      out.write("                            em biết đó trước khi chuyện mình thành ra thế này 2\n");
      out.write("                            đứa mình đã từng rất vuii vẻ và hạnh phúc vs nhau,\n");
      out.write("                            nhưng câu chúc ngủ ngon kèm icon yêu thương ngày đó\n");
      out.write("                            là những điều mà a luôn mong muốn nhất....mặc dù bây\n");
      out.write("                            giờ em ko còn hay làm những điều đó vs a nữa nhưng\n");
      out.write("                            vs a chưa giây phút nào mà a ngừng yêu em. Anh mong\n");
      out.write("                            là những điều a làm hiện tại sẽ khiến em có lại cảm\n");
      out.write("                            giác yêu a như ngày đầu tiên mình quen. Yêu em, công\n");
      out.write("                            chúa của anh ❤\n");
      out.write("                        </p>\n");
      out.write("                        <span>\n");
      out.write("                            <a class=\"link1\" onclick=\"myFunction()\" href=\"\">Ghê\n");
      out.write("                                Dọ</a>\n");
      out.write("                            <button type=\"button\" onmouseover=\"link22()\" id=\"no\"\n");
      out.write("                                    onmouseout=\"myF()\" class=\"link2\">Xạo</button>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"body2\">\n");
      out.write("                    <div class=\"child1\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <p>\n");
      out.write("                                Khi yêu nhau một thời gian đủ dài, đôi khi hai\n");
      out.write("                                đứa mình sẽ không còn quá nhiều chủ đề để nói\n");
      out.write("                                cùng\n");
      out.write("                                nhau nữa và cảm giác hào hứng, nôn nao khi gặp\n");
      out.write("                                nhau cũng vơi dần.\n");
      out.write("                                Tuy nhiên, những lúc như thế đừng nên im lặng\n");
      out.write("                                chịu đựng mà hãy học cách bày tỏ nỗi lòng và\n");
      out.write("                                cùng nhau “sưởi ấm” tình cảm một lần nữa. Có thể\n");
      out.write("                                là cùng nhau trải nghiệm điều gì mới, cùng nhau\n");
      out.write("                                đi du lịch, dành thời gian hẹn hò lãng mạn,...\n");
      out.write("                                Nhớ rằng, cảm xúc ấy là điều bình thường và hãy\n");
      out.write("                                nắm chặt tay nhau vượt qua khoảng thời gian đầy\n");
      out.write("                                “cám dỗ” ấy.\n");
      out.write("                                😉\n");
      out.write("                            </p>\n");
      out.write("                            <hr>\n");
      out.write("                            <h2>Sẽ có những lúc bạn cảm thấy “chán” đối phương</h2>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"child2\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <p>\n");
      out.write("                                Tình yêu mới nở khác rất nhiều so với cuộc tình\n");
      out.write("                                dài lâu. Có thể ban đầu em sẽ luôn giữ điện\n");
      out.write("                                thoại bên mình, nhắn tin suốt cả ngày với anh\n");
      out.write("                                mà không thấy chán. Nhưng khi yêu lâu thì\n");
      out.write("                                khác, hai đứa mình cần có không gian riêng để\n");
      out.write("                                trau\n");
      out.write("                                dồi bản thân và xây dựng tương lai hạnh phúc của\n");
      out.write("                                cả hai.\n");
      out.write("                                Đến lúc ấy, tin nhắn có thể thưa dần nhưng hiển\n");
      out.write("                                nhiên tình cảm thì vẫn đong đầy. Nếu thấy khó\n");
      out.write("                                khăn quá, em hãy bình tâm nghĩ lại những sóng\n");
      out.write("                                gió đã qua cùng nhau mà tiếp tục xây đắp cho\n");
      out.write("                                tương lai. Và chắc chắn 1 điều a luôn phía sau\n");
      out.write("                                lưng em.\n");
      out.write("                            </p>\n");
      out.write("                            <hr>\n");
      out.write("                            <h2>Không phải lúc nào cũng cần nhắn tin cho nhau</h2>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"child3\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <p>Tình yêu lâu dài nếu chẳng phải là tình yêu học\n");
      out.write("                                trò thì chắc chắn tần suất gặp gỡ sẽ vơi đi rất\n");
      out.write("                                nhiều. Không phải vì cả hai không muốn, cũng\n");
      out.write("                                chẳng phải vì hết yêu mà đơn giản vì mỗi người\n");
      out.write("                                đều đang bận quay cuồng với một loạt công việc\n");
      out.write("                                cần giải quyết.\n");
      out.write("                                Thế nhưng, gặp nhau ít đâu phải điều tệ hại.\n");
      out.write("                                Quan trọng là mỗi lần gặp gỡ đều là những lần\n");
      out.write("                                “chất lượng” nhất, có thể lấp đầy hết khoảng\n");
      out.write("                                không trống vắng những lúc xa nhau.\n");
      out.write("                                Nhớ nhé, cố gắng một chút nữa thôi để tương lai\n");
      out.write("                                có nhau mỗi ngày. ❤</p>\n");
      out.write("                            <hr>\n");
      out.write("                            <h2>Gặp nhau ít nhưng chưa chắc đã “tệ”</h2>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"Body3\">\n");
      out.write("                    <h2>Let's look back at all we've been through</h2>\n");
      out.write("                    <video width=\"80%\" src=\"./assets/IMG/Đàn.mp4\" controls></video>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body4\">\n");
      out.write("                <ul>\n");
      out.write("<!--                    <li><img width=\"100%\" src=\"./assets/IMG/Đàn.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img width=\"100%\" src=\"./assets/IMG/black.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img width=\"100%\" src=\"./assets/IMG/first.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img width=\"100%\" src=\"./assets/IMG/Noel.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img width=\"100%\" src=\"./assets/IMG/100Days.jpg\" alt=\"\"></li>-->\n");
      out.write("<li><video controls width=\"100%\" height=\"100%\" src=\"./assets/IMG/ngày đầu.mp4\"></video></li>\n");
      out.write("<li><video controls width=\"100%\" height=\"100%\" src=\"./assets/IMG/giai đoạn giữa.mp4\"></video></li>\n");
      out.write("<li><video controls width=\"100%\" src=\"./assets/IMG/100days.mp4\"></video></li>\n");
      out.write("<li><video controls width=\"100%\" src=\"./assets/IMG/200days.mp4\"></video></li>\n");
      out.write("<li><video controls width=\"100%\" src=\"./assets/IMG/final video.mp4\"></video></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body5\">\n");
      out.write("                <p>\n");
      out.write("                    Em có bất ngờ khi nhìn thấy trang web này không ? <br>\n");
      out.write("                    Em biết không Anh đã làm trang web này với tất cả tấm lòng\n");
      out.write("                    của mình nhằm đem lại sự bất ngờ, niềm vui cũng như mong Em\n");
      out.write("                    thấu hiểu tình cảm của Anh dành cho.\n");
      out.write("                    Em À! Từ rất lâu rồi Anh đã cảm thấy Em như là một phần\n");
      out.write("                    không thể thiếu trong cuộc sống của Anh. Bởi lẽ Ánh mắt long\n");
      out.write("                    lanh cùng với nụ cười của Em đã làm đắm say đám con tim của\n");
      out.write("                    Anh. Hình bóng của Em luôn ở trong tâm thức của Anh. Hằng\n");
      out.write("                    đêm không biết bao nhiêu lần con tim của Anh đã thổn thức\n");
      out.write("                    khi nghĩ tới. Anh chỉ biết yêu Em bằng tất cả trái tim mình\n");
      out.write("                    dù lòng chỉ trộm nhớ thương thầm thôi. Ngày nào Anh cũng\n");
      out.write("                    muốn nhìn thấy Em, nói chuyện với Em. Một ngày sẽ trở nên\n");
      out.write("                    dài làm sao khi vắng bóng của Em. Những lúc được gần Em, cảm\n");
      out.write("                    thấy như thời gian sao thôi qua thật nhanh, đó là những giây\n");
      out.write("                    phút sung sướng nhất đối với Anh. Anh rất muốn được chia sẻ\n");
      out.write("                    những niềm vui nỗi buồn cùng Em. Anh thầm cảm ơn thượng đế\n");
      out.write("                    đã cho Anh gặp được Em... Và cuối cùng anh chỉ muốn hỏi em\n");
      out.write("                    điều này thui..\n");
      out.write("                </p>\n");
      out.write("                <h1>Chặng đường phía trước còn rất dài, em sẽ cùng anh đi tiếp\n");
      out.write("                    chứ ? </h1>\n");
      out.write("                <a onclick=\"Yeah()\" href=\"\">Dạ ❤</a>\n");
      out.write("            </div>\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"Final\">\n");
      out.write("                    <p>\n");
      out.write("                        <i class=\"fa-sharp fa-solid fa-phone\"></i> Holite:\n");
      out.write("                        0913562870 <br>\n");
      out.write("                        Facebook: Trung's Nguyen's <br>\n");
      out.write("                        <i class=\"fa-sharp fa-solid fa-at\"></i> Email:\n");
      out.write("                        taokhongpk9b@gmail.com <br>\n");
      out.write("                        Product: Được tạo bởi người yêu bé Zann\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"./assets/js/after_login.js\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/78025ca858.js\" crossorigin=\"anonymous\"></script>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
