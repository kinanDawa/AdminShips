$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(country){
			$('#idEdit').val(country.id);
			$('#capitalEdit').val(country.capital);
			$('#descriptionEdit').val(country.description);
			$('#codeEdit').val(country.code);
			$('#continentEdit').val(country.continent);
			$('#nationalityEdit').val(country.nationality);
		});		
		$('#editModal').modal();
	});
	
	$('table #detailsButton').on('click',function(event){
	     	 event.preventDefault();
			var href=$(this).attr('href');
		
		$.get(href,function(country){
			$('#idDetails').val(country.id);
			$('#capitalDetails').val(country.capital);
			$('#descriptionDetails').val(country.description);
			$('#codeDetails').val(country.code);
			$('#continentDetails').val(country.continent);
			$('#nationalityDetails').val(country.nationality);
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