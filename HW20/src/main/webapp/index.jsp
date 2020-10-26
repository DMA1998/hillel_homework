<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form Demo</title>
</head>
<body>
<div align="left">
    Task 1
    <br/><br/>
    Enter numbers through commas:<br/><br/>
    <form method="post" action="sortArrayServlet">
        <input type="text" name="numbers"/>
        <br/><br/>
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
<br/>
<body>
<div align="left">
    Task 2
    <br/><br/>
    Enter a word:<br/><br/>
    <form method="post" action="findWordServlet">
        <input type="text" name="word"/>
        <br/><br/>
        <input type="submit" value="Submit"/>
    </form>
</div>
</body>
</html>