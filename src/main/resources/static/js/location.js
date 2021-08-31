$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(location){
			$('#idEdit').val(location.id);
		    $('#cityEdit').val(location.city);
			$('#editCountryDetails').val(location.countryid);
			$('#editStateDetails').val(location.stateid);
			$('#detailsEdit').val(location.details);
			$('#addressEdit').val(location.address);


		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(location){
			$('#idDetails').val(location.id);
			$('#cityDetails').val(location.city);
			$('#addressDetails').val(location.address);
			$('#countryDetailsDetails').val(location.countryid);
			$('#stateDetailsDetails').val(location.stateid);
			$('#detailsDetails').val(location.details);
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