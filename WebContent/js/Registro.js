const pwd1= document.getElementById('pdw1');

function $(id){
	return document.getElementById(id);
}

function register(){
	const data = {
		name: $('name').value,
		user: $('user').value,
		email: $('email').value,
		phone: $('phone').value,
		date: $('date').value,
		pwd: $('pwd').value
	},
	
	params={
		method:"POST",
		headers: new Headers({'Content-Type': 'application/json'}),
		body:JSON.stringify(data)
	}
	fetch("./../registe",params)
		.then(resp => resp.JSON())
		.then(resp =>{
			console.log(resp);
			if (resp.status === 200){
				localtion.href="./../view/login.html";
			}else{
				M.toast({html: resp.message + ",status(" + res.status + ")", inDuration:500,outDuration:500})
			}
		});
}
