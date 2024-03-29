<%-- 
    Document   : home_afterLogin
    Created on : Jan 16, 2023, 10:30:18 AM
    Author     : TRUNG
--%>
<%
    response.setContentType("text/html;charset=UTF-8");
    request.setCharacterEncoding("utf-8");
%>
<%@page contentType="text/html" errorPage="error.jsp" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="./assets/Css/home_afterLogin.css">
    </head>
    <body>
        <section>
            <header>
                <div class="header1">
                    <img width="40px" style="margin-top: -5px;" src="./assets/IMG/logo.png"
                         alt="Logo">
                    <h1>ChunnZann</h1>
                </div>
                <ul>
                    <li><a class="mau1" href="">Product</a></li> <i
                        class="fa-sharp fa-solid
                        fa-chevron-down"></i>
                    <li><a class="mau2" href="">Learning Center</a></li><i
                        class="fa-sharp fa-solid
                        fa-chevron-down"></i>
                    <li><a class="mau3" href="">About</a></li><i class="fa-sharp fa-solid fa-chevron-down"></i>
                    <li><a class="mau4" href="">Pricing</a></li>
                    <li><a class="mau5" href="">Watch Demo</a></li>
                    <span class="span1">
                        <li><a class="mau6" href="">Talk To Sales</a></li>
                        <li><a class="mau7" href="">Login</a></li>
                        <li><a class="mau8" href="">Get Started</a></li>
                    </span>
                </ul>
            </header>
            <div class="allBody">
                <div class="body1">
                    <div class="video">
                        <video width="100%" controls
                               src="./assets/IMG/Allvideo.mp4"></video>
                        <i class="fa-sharp fa-solid fa-mobile-screen-button"></i>
                    </div>
                    <div class="body1Child">
                        <h1>How did we come together? </h1>
                        <p>
                            Nếu 1 ngày nào đó em cảm thấy buồn và ko còn muốn
                            yêu a nữa thì em hãy xem cái này, kĩ thuật làm video
                            của a so vs em thì còn thua xa lắm, nhưng mà đây là
                            điều mà từ trước tới giờ a chưa từng làm cho ai cả,
                            em biết đó trước khi chuyện mình thành ra thế này 2
                            đứa mình đã từng rất vuii vẻ và hạnh phúc vs nhau,
                            nhưng câu chúc ngủ ngon kèm icon yêu thương ngày đó
                            là những điều mà a luôn mong muốn nhất....mặc dù bây
                            giờ em ko còn hay làm những điều đó vs a nữa nhưng
                            vs a chưa giây phút nào mà a ngừng yêu em. Anh mong
                            là những điều a làm hiện tại sẽ khiến em có lại cảm
                            giác yêu a như ngày đầu tiên mình quen. Yêu em, công
                            chúa của anh ❤
                        </p>
                        <span>
                            <a class="link1" onclick="myFunction()" href="">Ghê
                                Dọ</a>
                            <button type="button" onmouseover="link22()" id="no"
                                    onmouseout="myF()" class="link2">Xạo</button>
                        </span>
                    </div>
                </div>
                <div class="body2">
                    <div class="child1">
                        <a href="">
                            <p>
                                Khi yêu nhau một thời gian đủ dài, đôi khi hai
                                đứa mình sẽ không còn quá nhiều chủ đề để nói
                                cùng
                                nhau nữa và cảm giác hào hứng, nôn nao khi gặp
                                nhau cũng vơi dần.
                                Tuy nhiên, những lúc như thế đừng nên im lặng
                                chịu đựng mà hãy học cách bày tỏ nỗi lòng và
                                cùng nhau “sưởi ấm” tình cảm một lần nữa. Có thể
                                là cùng nhau trải nghiệm điều gì mới, cùng nhau
                                đi du lịch, dành thời gian hẹn hò lãng mạn,...
                                Nhớ rằng, cảm xúc ấy là điều bình thường và hãy
                                nắm chặt tay nhau vượt qua khoảng thời gian đầy
                                “cám dỗ” ấy.
                                😉
                            </p>
                            <hr>
                            <h2>Sẽ có những lúc bạn cảm thấy “chán” đối phương</h2>
                        </a>
                    </div>
                    <div class="child2">
                        <a href="">
                            <p>
                                Tình yêu mới nở khác rất nhiều so với cuộc tình
                                dài lâu. Có thể ban đầu em sẽ luôn giữ điện
                                thoại bên mình, nhắn tin suốt cả ngày với anh
                                mà không thấy chán. Nhưng khi yêu lâu thì
                                khác, hai đứa mình cần có không gian riêng để
                                trau
                                dồi bản thân và xây dựng tương lai hạnh phúc của
                                cả hai.
                                Đến lúc ấy, tin nhắn có thể thưa dần nhưng hiển
                                nhiên tình cảm thì vẫn đong đầy. Nếu thấy khó
                                khăn quá, em hãy bình tâm nghĩ lại những sóng
                                gió đã qua cùng nhau mà tiếp tục xây đắp cho
                                tương lai. Và chắc chắn 1 điều a luôn phía sau
                                lưng em.
                            </p>
                            <hr>
                            <h2>Không phải lúc nào cũng cần nhắn tin cho nhau</h2>
                        </a>
                    </div>
                    <div class="child3">
                        <a href="">
                            <p>Tình yêu lâu dài nếu chẳng phải là tình yêu học
                                trò thì chắc chắn tần suất gặp gỡ sẽ vơi đi rất
                                nhiều. Không phải vì cả hai không muốn, cũng
                                chẳng phải vì hết yêu mà đơn giản vì mỗi người
                                đều đang bận quay cuồng với một loạt công việc
                                cần giải quyết.
                                Thế nhưng, gặp nhau ít đâu phải điều tệ hại.
                                Quan trọng là mỗi lần gặp gỡ đều là những lần
                                “chất lượng” nhất, có thể lấp đầy hết khoảng
                                không trống vắng những lúc xa nhau.
                                Nhớ nhé, cố gắng một chút nữa thôi để tương lai
                                có nhau mỗi ngày. ❤</p>
                            <hr>
                            <h2>Gặp nhau ít nhưng chưa chắc đã “tệ”</h2>
                        </a>
                    </div>
                </div>
                <div class="Body3">
                    <h2>Let's look back at all we've been through</h2>
                    <video width="80%" src="./assets/IMG/Đàn.mp4" controls></video>
                </div>
            </div>
            <div class="body4">
                <ul>
<!--                    <li><img width="100%" src="./assets/IMG/Đàn.jpg" alt=""></li>
                    <li><img width="100%" src="./assets/IMG/black.jpg" alt=""></li>
                    <li><img width="100%" src="./assets/IMG/first.jpg" alt=""></li>
                    <li><img width="100%" src="./assets/IMG/Noel.jpg" alt=""></li>
                    <li><img width="100%" src="./assets/IMG/100Days.jpg" alt=""></li>-->
<li><video controls width="100%" height="100%" src="./assets/IMG/ngày đầu.mp4"></video></li>
<li><video controls width="100%" height="100%" src="./assets/IMG/giai đoạn giữa.mp4"></video></li>
<li><video controls width="100%" src="./assets/IMG/100days.mp4"></video></li>
<li><video controls width="100%" src="./assets/IMG/200days.mp4"></video></li>
<li><video controls width="100%" src="./assets/IMG/final video.mp4"></video></li>
                </ul>
            </div>
            <div class="body5">
                <p>
                    Em có bất ngờ khi nhìn thấy trang web này không ? <br>
                    Em biết không Anh đã làm trang web này với tất cả tấm lòng
                    của mình nhằm đem lại sự bất ngờ, niềm vui cũng như mong Em
                    thấu hiểu tình cảm của Anh dành cho.
                    Em À! Từ rất lâu rồi Anh đã cảm thấy Em như là một phần
                    không thể thiếu trong cuộc sống của Anh. Bởi lẽ Ánh mắt long
                    lanh cùng với nụ cười của Em đã làm đắm say đám con tim của
                    Anh. Hình bóng của Em luôn ở trong tâm thức của Anh. Hằng
                    đêm không biết bao nhiêu lần con tim của Anh đã thổn thức
                    khi nghĩ tới. Anh chỉ biết yêu Em bằng tất cả trái tim mình
                    dù lòng chỉ trộm nhớ thương thầm thôi. Ngày nào Anh cũng
                    muốn nhìn thấy Em, nói chuyện với Em. Một ngày sẽ trở nên
                    dài làm sao khi vắng bóng của Em. Những lúc được gần Em, cảm
                    thấy như thời gian sao thôi qua thật nhanh, đó là những giây
                    phút sung sướng nhất đối với Anh. Anh rất muốn được chia sẻ
                    những niềm vui nỗi buồn cùng Em. Anh thầm cảm ơn thượng đế
                    đã cho Anh gặp được Em... Và cuối cùng anh chỉ muốn hỏi em
                    điều này thui..
                </p>
                <h1>Chặng đường phía trước còn rất dài, em sẽ cùng anh đi tiếp
                    chứ ? </h1>
                <a onclick="Yeah()" href="">Dạ ❤</a>
            </div>
            <footer>
                <div class="Final">
                    <p>
                        <i class="fa-sharp fa-solid fa-phone"></i> Holite:
                        0913562870 <br>
                        Facebook: Trung's Nguyen's <br>
                        <i class="fa-sharp fa-solid fa-at"></i> Email:
                        taokhongpk9b@gmail.com <br>
                        Product: Được tạo bởi người yêu bé Zann
                    </p>
                </div>
            </footer>
        </section>
    </body>
</html>
<script src="./assets/js/after_login.js"></script>
<script src="https://kit.fontawesome.com/78025ca858.js" crossorigin="anonymous"></script>
