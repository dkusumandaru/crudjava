$( document ).ready(function() {
	matchingSelect();

	function matchingSelect(){
		var idRole = $('#idRole').val();
		var idDepartment = $('#idDepartment').val();
		$("#idRoleUpdate option[value='"+idRole+"']").attr("selected", true);
		$("#idDepartmentUpdate option[value='"+idDepartment+"']").attr("selected", true);

		catchRole();
	}

	function catchRole(){

		var nameRole, idRole;
		nameRole = $('#idRoleUpdate option:selected').text();
		idRole = $('#idRoleUpdate option:selected').val();

		if (nameRole == 'doctor') {
			$('#doctorForm').html(doctorForm);
			$('#accessNameRole').val(nameRole);
			catchRoom();

			$('#add-user-form').attr("action", "/doctor/edit/");
		}else{
			$('#add-user-form').attr("action", "/user/edit/");
		}
	}

	function catchRoom(){
		var capacityRoom, urlRoom;
		capacityRoom = $('#capacityRoom').val();
		urlRoom = $('#urlRoom').val();
		console.log(capacityRoom);
		console.log(urlRoom);
		$('#urlRoomInput').val(urlRoom);
		$('#capacityRoomInput').val(capacityRoom);

	}


});