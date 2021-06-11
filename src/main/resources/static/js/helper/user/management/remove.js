// remove_record
$(document).ready(function(){
	$("button.remove_record").click(function(event) {
        var idUser = event.target.id;
        var firstNameText = $('#firstNameText' + idUser).text();
        var lastNameText = $('#lastNameText' + idUser).text();

        var name = firstNameText+' '+lastNameText;

        $('.nameUserRemoveText').text(name);
        $('.idUserRemove').val(idUser);
        $('#remove-row-form').attr("action", "/user/remove/" + idUser);
        $('#removeUser').modal('toggle');
	});
});