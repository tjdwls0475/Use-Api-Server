$(document).ready(function() {
	
	const json = './json/data.json';

	$.getJSON(json, function(data) {
		
		let member_data = "";
		$.each(data, function(key, value) {
			member_data += "<tr>";
			member_data += "<td>" + value.name + "</td>";
			member_data += "<td>" + value.number + "</td>";
			member_data += "<td>" + value.age + "</td>";
			member_data += "</tr>";
		})
		
		$('#member_table').append(member_data);
		/*$.each(data, function(key, value) {
			
			console.log(value.name);
			console.log(value.number);
			console.log(value.age);
			
			$('table').attr('border', '10');
			
			$('tbody').append(
				"<tr>" +
				"<td>" + value.name + "</td>" +
				"<td>" + value.number + "</td>" +
				"<td>" + value.age + "</td>" +
				"</td>"
			);
		})*/
	});
	
})