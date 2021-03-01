package com.example.Controller;
import java.util.List;

import com.example.account.Account;
//import com.example.Hello;
import com.example.account.ProjectDao;
import com.example.client.Client;
import com.example.project.ProjectDaoImpl;

import io.javalin.http.Handler;
import io.javalin.plugin.json.JavalinJson;

public class ClassController {
	
	public static final Handler CLIENTGET=(ctx->{
//		System.out.println(ctx.pathParam("id"));
		ctx.json(ProjectDaoImpl.getAllClient());
		
	});

	

	public static final Handler CLIENTPOST=(ctx->{
		System.out.println(JavalinJson.fromJson(ctx.body(), Client.class));
//		System.out.println(ctx.json(ProjectDaoImpl.InsertClient("omkar","konduru",26)));
		ProjectDaoImpl.callableInsertFood("","",900);
	});
	
	
	
	public static final Handler CLIENTGET2=(ctx->{
		System.out.println("the path param is" + ctx.pathParam("id"));
		ctx.json(ProjectDaoImpl.getClientid());
		
		
	});
	

	public static final Handler PUT=(ctx->{
		
		ctx.json(ProjectDaoImpl.putClientid());
		
		
	});
	
public static final Handler DELETE=(ctx->{
		
		ctx.json(ProjectDaoImpl.Deleteid());
		
		
	});

//public static final Handler GET=(ctx->{
//	
//	ctx.json(ProjectDaoImpl.getClientandAccount());
//	
//	
//});
public static final Handler GET2=(ctx->{
	
	ctx.json(ProjectDaoImpl.getAllAccount());
	
	
});
public static final Handler GET3=(ctx->{
	
	ctx.json(ProjectDaoImpl.getAllAccount());

	
	
});
public static final Handler GET4=(ctx->{
	
	ctx.json(ProjectDaoImpl.getAllAccount1());

	
	
});
public static final Handler PUT1=(ctx->{
	
	ctx.json(ProjectDaoImpl.getAllAccount5());

	
	
});

public static final Handler DELETE1=(ctx->{
	
	ctx.json(ProjectDaoImpl.getDelete());

	
	
});


public static final Handler GET5=(ctx->{
	int id = Integer.parseInt(ctx.pathParam("id"));
	//int sn = Integer.parseInt(ctx.pathParam("sn"));
	
	Class<Account> account = Account.class;
	if (account != null) {
		ctx.status(200);
		ctx.json(account);
		System.out.println(account.toString());
	} else { 
		ctx.result("No account with that ID exists");
		System.out.println("No account with that ID exist");
		ctx.status(404);
	}


});

}


