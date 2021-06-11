$(document).ready(function() {
    $('#activeApplicationStatus').val('true');
});


function editApplicationStatus(param) {
    console.log(param);
    var idApplicationStatus = $('#statusIdText' + param).text();
    var nameApplicationStatus = $('#namaStatusText' + param).text();
    var activeApplicationStatus = $('#statusText' + param).text();

    $('.idApplicationStatusEdit').val(idApplicationStatus);
    $('.nameApplicationStatusEdit').val(nameApplicationStatus);
    $('.activeApplicationStatusEdit').val('true');
    $('#edit-row-form').attr("status", "/status/edit/" + idApplicationStatus);
    $('#editApplicationStatus').modal('toggle');
}

function removeApplicationStatus(param) {
    var idApplicationStatus = $('#idApplicationStatusText' + param).text();
    var nameApplicationStatus = $('#nameApplicationStatusText' + param).text();
    console.log(idApplicationStatus);
    $('.idApplicationStatusRemove').val(idApplicationStatus);
    $('.nameApplicationStatusRemove').val(nameApplicationStatus);
    $('.activeApplicationStatusRemove').val('false');
    $('.nameApplicationStatusRemoveText').text(nameApplicationStatus);
    $('#remove-row-form').attr("status", "/status/edit/" + idApplicationStatus);
    $('#removeApplicationStatus').modal('toggle');
}


$(document).ready(function() {
    $('#activeApplicationStatus').val('true');
});