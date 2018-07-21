<html>
<script type="text/javascript" >
    var xmlHttp;
    var user = {
        "name": "JS",
        "value": 10
    }
    function Ajax() {
        alert(JSON.stringify(user));
        createXmlHttp();
        xmlHttp.onreadystatechange = callback;
        var url = "/json?user=" + encodeURIComponent(JSON.stringify(user)) + '&amp;_dc=' + new Date().getTime();
        xmlHttp.open("GET",url,true);
        xmlHttp.send();
    }

    function createXmlHttp() {
        if (window.XMLHttpRequest){
            xmlHttp = new XMLHttpRequest();
        } else {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
        function callback() {
            if(xmlHttp.readyState === 4){
                if(xmlHttp.status === 200){
                    var jsonObj = JSON.parse(xmlHttp.responseText);
                    document.getElementById("Name").innerHTML = jsonObj.name;
                    document.getElementById("Value").innerHTML = jsonObj.value;
                }
            }
        }

</script>
<body>
<h2>Hello World!</h2>
<div id = "Name">123</div>
<div id = "Value">123</div>
<button name="open" onclick="Ajax()">Ajax</button>
</body>
</html>
