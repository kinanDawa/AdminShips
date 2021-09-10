$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(vehicleMake){
			$('#idEdit').val(vehicleMake.id);
		    $('#cityEdit').val(vehicleMake.city);
			$('#detailsEdit').val(vehicleMake.details);
		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(vehicleMake){
			$('#idDetails').val(vehicleMake.id);
			$('#detailsDetails').val(vehicleMake.details);
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