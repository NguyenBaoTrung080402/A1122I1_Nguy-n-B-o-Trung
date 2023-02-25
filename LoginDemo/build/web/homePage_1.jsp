<%-- 
    Document   : homePage
    Created on : Feb 11, 2023, 3:53:42 PM
    Author     : TRUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./assets/CSS/index.css">
        <link rel="stylesheet" href="owlcarousel/owl.carousel.min.css">
        <link rel="stylesheet" href="owlcarousel/owl.theme.default.min.css">
        <link rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
        <style>
            .login h4{
                color: gray;
                font-size: x-large;
                font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            }
        </style>
    </head>
    <body>
        <body>
        <hr>
        <div id="header" class="col-md-11">

            <div class="search">
                <input class="search-input" width="80%" type="text" name=""
                    id="" placeholder="Tìm Kiếm..."
                    style="padding-left: 15px;">
                <div class="icon">
                    <i class="fa-sharp fa-solid fa-magnifying-glass"></i>
                </div>
            </div>

            <img width="10%"
                 src="./assets/IMG/imgOFHomePage/thiet-ke-logo-nuoc-hoa-bee-design-02.jpg"
                alt="" class="logo">

            <!-- <select name="" id="menu1()" class="languega">
                <div class="option">
                    <option value="">VN</option>
                    <option value="">ENG</option>
                </div>
            </select> -->
            <div class="login" >
                <h4>WELCOME, ${Mess.username} </h4> 
            </div>
        </div>
        <hr>
        <div class="containe">
            <div class="bodyAll col-md-11">
                <div id="menu" class="">
                    <div><a href="">TRANG CHỦ</a></div>
                    <div><a href="">GIỚI THIỆU</a></div>
                    <div class="product">
                        <a href="">SẢN PHẨM</a><i class="fa-solid fa-angle-down"
                            style="cursor: pointer;"></i>
                        <!-- <div class="san_pham" id="menu1" onclick="menu1()">
                            <div id="menu2">
                                <div><a href="">SUNGLASSES</a></div>
                                <div><a href="">SHOES</a></div>
                                <div><a href="">WATCHES</a></div>
                            </div>
                        </div> -->
                    </div>
                    <div class="thuong_hieu">
                        <a href="">THƯƠNG HIỆU</a><i class="fa-solid
                            fa-angle-down"
                            style="cursor: pointer;"></i>
                        <!-- <div class="thuong_hieu">
                    <div><a href="">ADIDAS</a></div>
                    <div><a href="">CAMEL</a></div>
                </div> -->
                    </div>
                    <div><a href="">BIG SALE</a></div>
                    <div><a href="">TOP 2022</a></div>
                </div>
                <div id="gio_hang">
                    <p>
                        GIỎ HÀNG <i class="fa-solid fa-cart-shopping"
                            style="cursor:
                            pointer;"></i>
                    </p>
                    <!-- <div class="tongCong">
                <p>
                    TỔNG CỘNG
                </p>
                <div><a href="">Xem giỏ hàng</a></div>
                <div><a href="">Thanh Toán</a></div>
            </div> -->
                </div>
            </div>

            <div class="slide col-md-11">
                <!-- <img width="85%" src="./assets/IMG/slide-2.jpg" alt=""> -->
                <div id="carouselExampleControls" class="carousel slide w-100"
                    data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="w-100" src="./assets/IMG/imgOFHomePage/slide-2.jpg"
                                alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="w-100" src="./assets/IMG/imgOFHomePage/Rave.jpg"
                                alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="w-100"
                                 src="./assets/IMG/imgOFHomePage/123perfume.3.tang_.huong_-1170x538.jpg"
                                alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev"
                        href="#carouselExampleControls" role="button"
                        data-slide="prev">
                        <span class="carousel-control-prev-icon"
                            aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next"
                        href="#carouselExampleControls" role="button"
                        data-slide="next">
                        <span class="carousel-control-next-icon"
                            aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>

            </div>
        </div>
        <div class="body2">
            <div class="body2_child1 col-md-3">
                <img width="100%" src="./assets/IMG/imgOFHomePage/banner-1.jpg" alt="">
                <a href="">NƯỚC HOA NAM</a>
                <p class="mota">

                    Lorem Ipsum is simply dummy

                    text of the printing and typesetting industry.

                    Lorem Ipsum has
                </p>
            </div>
            <div class="body2_child1 col-md-3">
                <img width="100%" src="assets/IMG/imgOFHomePage/banner-2.jpg" alt="">
                <p class="mota">
                    <a href="">NƯỚC HOA NỮ</a>
                    Lorem Ipsum is simply dummy

                    text of the printing and typesetting industry.

                    Lorem Ipsum has
                </p>
            </div>
            <div class="body2_child1 col-md-3">
                <img width="100%" src="assets/IMG/imgOFHomePage/banner-3.jpg" alt="">
                <p class="mota">
                    <a href="">NƯỚC HOA MINI</a>
                    Lorem Ipsum is simply dummy

                    text of the printing and typesetting industry.

                    Lorem Ipsum has
                </p>
            </div>
        </div>
        <div class="body3">
            <h2 class="col-md-5">
                FEATURED PRODUCTS
            </h2>
            <div id="carouselExampleIndicators" class="carousel slide body3_item
                col-md-11"
                data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators"
                        data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators"
                        data-slide-to="1"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="list_product1">
                            <div class="product col-md-3">
                                <img
                                    width="100%" height="80%"
                                    src="./assets/IMG/imgOFHomePage/NUDE-1-1200x750.jpg"
                                    alt="">

                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Adidas UltraBoost 4.0 cookies and
                                        cream</a>
                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>

                            <div class="product col-md-3">
                                <img
                                    width="90%"
                                    src="./assets/IMG/imgOFHomePage/01-Burberry-Brit-For-Him-Eau-de-Toilette-50ml-Men.jpg"
                                    alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Silver Porto Headset</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>
                            <div class="product col-md-3">
                                <img
                                    width="90%" src="./assets/IMG/imgOFHomePage/Blossom Delight.jpg "alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Đồng Hồ Adidas</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>
                            <div class="product col-md-3">
                                <img
                                    width="90%"
                                    src="./assets/IMG/imgOFHomePage/Cabotine-Rose-EDP2.jpg"
                                    alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Đồng Hồ Adidas</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="list_product1">
                            <div class="product col-md-3">
                                <img
                                    src="http://porto03.123corp.com.vn/thumb/270x282/1/data/upload/zz-BB6180-01-2-600x600.jpg"
                                    alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Adidas UltraBoost 4.0 cookies and
                                        cream</a>
                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>
                            <div class="product col-md-3">
                                <img
                                    src="http://porto03.123corp.com.vn/thumb/270x282/1/data/upload/product-4.jpg
                                    " alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Silver Porto Headset</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>
                            <div class="product col-md-3">
                                <img
                                    src="http://porto03.123corp.com.vn/thumb/270x282/1/data/upload/wacth-3.png"
                                    alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Đồng Hồ Adidas</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>
                            <div class="product col-md-3">
                                <img
                                    src="http://porto03.123corp.com.vn/thumb/270x282/1/data/upload/wacth-3.png"
                                    alt="">
                                <a href="" class="xemnhanh">XEM NHANH</a>
                                <p>
                                    <a href="">Đồng Hồ Adidas</a>

                                </p>
                                <div class="price-box">
                                    <span style="text-decoration: line-through;
                                        color: gray;">4.500.000đ</span>
                                    <span>3.000.000đ</span>
                                </div>
                            </div>

                        </div>

                    </div>
                    <!-- <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </button> -->
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/78025ca858.js"
            crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/78025ca858.js"
            crossorigin="anonymous"></script>
        <!-- <script src="jquery.min.js"></script>
<script src="owlcarousel/owl.carousel.min.js"></script> -->
        <script src="assets/JS/index.js"></script>
    </body>
    </body>
</html>
