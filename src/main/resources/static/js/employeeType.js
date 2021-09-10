$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(employeeType){
			$('#idEdit').val(employeeType.id);
		    $('#cityEdit').val(employeeType.city);
			$('#detailsEdit').val(employeeType.details);
		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(employeeType){
			$('#idDetails').val(employeeType.id);
			$('#detailsDetails').val(employeeType.details);
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