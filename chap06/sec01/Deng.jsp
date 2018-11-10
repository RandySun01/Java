<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
        <style type="text/css">
            .div_1{width:160px;height:216px;background-image:url(../bulb_off.png);}
            .div_2{width:160px;height:216px;background-image:url(../bulb_on.png);}
        </style>
        <script language="javascript">
            
            function openlamp(){
                var div = document.getElementById("lamp");
                div.className ="div_2";
                document.write("feij");
            }
            
            function closelamp(){
                var div = document.getElementById("lamp");
                div.className ="div_1";
                document.write("feij");
            }
        </script>
    </head>
    <body>
        <div class="div_2" id="lamp">
        <input type="button" value="开" onclick="openlamp()"/> 
        <input type="button" value="关" onclick="closelamp()"/>
        </div>
        
    </body>
</html>