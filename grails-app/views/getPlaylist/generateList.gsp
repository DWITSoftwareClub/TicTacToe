<%--
  Created by IntelliJ IDEA.
  User: linuxsagar
  Date: 7/2/16
  Time: 5:26 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>BEATS Please!</title>
</head>

<body>

<div>
    <div id="h_border">

    </div>

    <div id="header">
        <div class="container">
            <h2>BEATS Please!</h2>
        </div>
    </div>

    <div class="content">
        <div class="container">
            <div class="info">
                <h2>Playlist!</h2>
                <br/>
                <p>Just click the YouTube play icon to listen the music!</p>
            </div>

            <div id="lists">
        <g:each in="${pl}" var="plst">

                <div class="playlist" class="row">
                    <div>
                        <div class="item">
                            <div class="title">
                                <h3>${plst.getKey()}</h3>
                            </div>
                            <div class="play">
                                <a href="${plst.getValue()}" target="_blank"><img src="https://www.youtube.com/yt/brand/media/image/YouTube-icon-full_color.png"/></a>
                            </div>
                        </div>
                    </div>

                    <div style="position: absolute">
                        <button class="like" title="Like" style="background: #06c789;position: absolute;color: #fff;border: none;padding: 5px 10px;right: 12px;font-size: 16px;text-transform: uppercase;outline: 0;font-weight: 700;box-shadow: 2px 2px 0px #aba17d;top: -150px;">Like</button>

                    <button style="top: -95px;" class="dislike" title="Dislike">Dislike</button>

                    </div>
                </div>
                <!-- playlist -->
        </g:each>



            </div>



        </div>

    </div>
</div>


</body>
</html>