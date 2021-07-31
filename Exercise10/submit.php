<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<?php
  $server = "remotemysql.com";
  $username = "PKsLR7vkAi";
  $password = "1LxIcfiEUr";
  $dbname = "PKsLR7vkAi";
  // Create connection
  $conn = new mysqli($server, $username, $password, $dbname);
  if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error); }

  //  find the count
    $sql = "SELECT count(*) as count FROM review;";
    $result = $conn->query($sql);
    $row = $result->fetch_assoc();
    $counter = $row["count"];

    if($counter <= 500){
        $value = $_POST['Value'];
        $counter++;
        $sql = "INSERT INTO review (value) VALUES ('$value')";
        if ($conn->query($sql) === TRUE) { 
          echo "<h1 style='text-align: center'>your response has been submitted !</h1>";
        } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
      }
    }else{
      echo "<h1 style='text-align: center'>Survey Closed! (limit exceeded)</h1>";
    }

    echo "<h2>Overall Responses</h2>";
    $sql = "SELECT value, count(*) as count FROM review group by value;";
    $result = $conn->query($sql);
    if ($result->num_rows > 0) {
      // output data of each row
      echo "<table style='border-collapse: collapse;'><tr><th>Type</th> <th>count</th> <th>Percentage</th></tr>";
      while($row = $result->fetch_assoc()) {
        echo "<tr><td>" . $row["value"] . "</td><td>". $row["count"] . "</td><td>" . number_format((float)($row["count"]/$counter)*100, 2, '.', '') . "%</td></tr>";
      }
      echo "</table>";
    }
    $conn->close();
?>