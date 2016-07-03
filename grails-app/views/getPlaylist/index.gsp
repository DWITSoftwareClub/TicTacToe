<%--
  Created by IntelliJ IDEA.
  User: linuxsagar
  Date: 7/2/16
  Time: 5:07 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <meta name="layout" content="main"/>
    <title>BEATS Please!</title>


</head>

<body>
<g:form method="post" action="generateList">

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
                    <h2>Whats your mood? Beats Please!</h2>
                    <br/>
                    <p>Just pick a mood to start listening to some great music!</p>
                    <p>We'll do our best to get you a great playlist</p>
                </div>

                <div id="picks">
                    <div id="select">
                        <select name="mood" id="mood">
                            <option selected="">How's your mood?</option>
                            <option value="Happy">Happy</option>
                            <option value="Sad">Sad</option>
                            <option value="Love">Love</option>
                            <option value="Nervous">Nervous</option>
                            <option value="Anxious">Anxious</option>
                            <option value="Energetic">Energetic</option>
                            <option value="Angry">Angry</option>
                            <option value="Workout">Workout</option>
                            <option value="Break Up">Break Up</option>
                            <option value="Dance">Dance</option>
                            <option value="Sleepy">Sleepy</option>
                            <option value="Relax">Relax</option>
                            <option value="Exhaustion">Exhaustion</option>
                            <option value="Calm">Calm</option>
                            <option value="Romantic">Romantic</option>
                        </select>
                    </div>

                    <input style="background: #a03810;display: inline-block;width: 100px;color: #fff;padding: 15px 5px;border-radius: 5px;
                               font-size: 24px;text-transform: uppercase;margin-top: 10px;border: none; outline: 0;" id="submit" type="submit" value="Go!" />
                </div>

            </div>
        </div>





    </div>
</g:form>
</body>
</html>