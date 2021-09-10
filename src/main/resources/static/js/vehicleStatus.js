$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(vehicleStatus){
			$('#idEdit').val(vehicleStatus.id);
		    $('#cityEdit').val(vehicleStatus.city);
			$('#detailsEdit').val(vehicleStatus.details);
		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(vehicleStatus){
			$('#idDetails').val(vehicleStatus.id);
			$('#detailsDetails').val(vehicleStatus.details);
		});		
		$('#detailsModal').modal();
	});
	
	$('table #deleteButton').on('click',function(event){
	     	 event.preventDefault();
 	 //when the modalButton is clicked then delete the modal that is displayed
	         var href=$(this).attr('href');
	         
	     	$('#confirmDeleteButton').attr('href',href);

	     	 $('#deleteModal').modal();
	});
});