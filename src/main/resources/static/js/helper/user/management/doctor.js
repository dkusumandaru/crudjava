var doctorForm = '<div class="row"><div class="col-sm-3"><div class="form-group"><label>Capacity</label><input id="capacityRoomInput" name="capacityRoomInput" type="number" class="form-control" placeholder="Room Capacity" required></div></div><div class="col-sm-9"><div class="form-group"><label>Url Room</label><input id="urlRoomInput" name="urlRoomInput" type="text" class="form-control" placeholder="Url Room" required></div></div></div><div class="form-line hidden"><input type="text" id="accessNameRole" name="accessNameRole"  class="form-control" placeholder="" required></div>';


function changeRoleUser(param){

	var nameRole, idRole;

	if (param == 'edit') {
		nameRole = $('#idRoleUpdate option:selected').text();
		idRole = $('#idRoleUpdate option:selected').val();
	}else if(param == 'add'){
		nameRole = $('#idRole option:selected').text();
		idRole = $('#idRole option:selected').val();
	}

	console.log(nameRole);
	console.log(idRole);

	changeRole(param, nameRole, idRole);
}

function changeRole(accessAction, nameRole, idRole){
	if (nameRole == 'doctor') {
		
		$('#doctorForm').html(doctorForm);
		$('#accessNameRoleUser').val(nameRole);
		$('#accessIdRoleUser').val(idRole);
		$('#accessNameRole').val(nameRole);
		$('#add-user-form').attr("action", "/doctor/"+accessAction+"/");
	}else{
		$('#doctorForm').html('');
		$('#add-user-form').attr("action", "/user/"+accessAction+"/");
	}

	// accessUrl(accessAction, nameRole);
}

// fucntion accessUrl(accessAction, nameRole){
// 	if (nameRole == 'doctor') {		
// 		$('#add-user-form').attr("action", "/doctor/"+accessAction+"/");
// 	}else{
// 		$('#add-user-form').attr("action", "/user/"+accessAction+"/");
// 	}
// }

// 	// <div class="row">
// 	// 		<div class="col-sm-2">
// 	// 			<div class="form-group">
// 	// 			<label>Capacity</label>
// 	// 			<input id="capacityRoom" name="capacityRoom" type="number" class="form-control" placeholder="" required>
// 	// 			</div>
// 	// 		</div>
// 	// 		<div class="col-sm-8">
// 	// 			<div class="form-group">
// 	// 			<label>Url</label>
// 	// 			<input id="urlRoom" name="urlRoom" type="text" class="form-control" placeholder="" required>
// 	// 			</div>
// 	// 		</div>
// 	// 	</div>

// 	// <div class="form-line">
// 	// 	<input type="text" id="accessNameRole" name="accessNameRole"  class="form-control" placeholder="" required>
// 	// </div>