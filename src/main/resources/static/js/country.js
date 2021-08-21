$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
	
		// /countries/findById/?id=1
		var href=$(this).attr('href');
		
		$get(href,function(country,status){
			$('#idEdit').val(country.id);
			$('#capitalEdit').val(country.capital);
			$('#descriptionEdit').val(country.description);
			$('#codeEdit').val(country.code);
			$('#continentEdit').val(country.continent);
			$('#nationalityEdit').val(country.nationality);

			
		});
		
		$('#editModal').modal();
	});
	
	
});