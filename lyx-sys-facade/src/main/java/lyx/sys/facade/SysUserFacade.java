package lyx.sys.facade;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.fastjson.JSONObject;

//rest服务的注解需要在接口端
@Path("/sysUserService")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface SysUserFacade {
	
	//对外不提供服务的时候就可以不加path注解
	@POST
	public String generateKey() throws Exception;
	
	@GET
	@Path("/getById/{id}") 
	public JSONObject getById(@PathParam(value = "id") String id) throws Exception;
	
	@POST
	@Path("/getList")
	public List<JSONObject> getList() throws Exception;
	
	@POST
	public int insert(JSONObject jsonObject) throws Exception;
	
	
}
