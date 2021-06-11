$(document).ready(function() {
    $('#status').val('true');
});


function editApplicationStatus(param) {
    console.log(param);
    var idApplicationStatus = $('#statusIdText' + param).text();
    var nameApplicationStatus = $('#namaStatusText' + param).text();
    var activeApplicationStatus = $('#statusText' + param).text();

    $('.idApplicationStatusEdit').val(idApplicationStatus);
    $('.nameApplicationStatusEdit').val(nameApplicationStatus);
    $('.activeApplicationStatusEdit').val('true');
    // $('#edit-row-form').attr("action", "/status/edit");
    $('#editApplicationStatus').modal('toggle');
}

function removeApplicationStatus(param) {
    var idApplicationStatus = $('#statusIdText' + param).text();
    var nameApplicationStatus = $('#namaStatusText' + param).text();
    console.log(idApplicationStatus);
    $('.idApplicationStatusRemove').val(idApplicationStatus);
    $('.nameApplicationStatusRemove').val(nameApplicationStatus);
    $('.activeApplicationStatusRemove').val('false');
    $('.nameApplicationStatusRemoveText').text(nameApplicationStatus);
    // $('#remove-row-form').attr("action", "/status/edit");
    $('#removeApplicationStatus').modal('toggle');
}


$(document).ready(function() {
    $('#status').val('true');
});