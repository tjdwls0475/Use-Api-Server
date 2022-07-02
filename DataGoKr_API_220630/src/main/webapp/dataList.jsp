<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
  <head>
    <meta charset="UTF-8">
    <title>dataList</title>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="./js/data.js"></script>
    <link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  </head>
  <body>
    <div class="container">
      <h4 style="text-align: center; padding-top: 50px">JSON Data List</h4>
      <table class="table table-striped"id="member_table">
        <thead>
          <tr>
            <th>이름</th>
            <th>번호</th>
            <th>나이</th>
          </tr>
        </thead>
        <tbody></tbody>
      </table>  
    </div>
  </body>
  </html>