$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(state){
			$('#idEdit').val(state.id);
			$('#addCountryEdit').val(state.countryId);
			$('#nameEdit').val(state.name);
			$('#detailsEdit').val(state.details);
			$('#capitalEdit').val(state.capital);
			$('#codeEdit').val(state.code);


		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(state){
			$('#idDetails').val(state.id);
			$('#capitalDetails').val(state.capital);
			$('#nameDetails').val(state.name);
			$('#codeDetails').val(state.code);
			$('#detailsDetails').val(state.details);
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