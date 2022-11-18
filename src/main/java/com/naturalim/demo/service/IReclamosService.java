package com.naturalim.demo.service;

import com.naturalim.demo.models.Reclamos;
import com.naturalim.demo.models.Response;

public interface IReclamosService {
	
	public Response<Reclamos> ObtenerListaReclamos();
	
	public Response<Reclamos> CrearReclamos(Reclamos reclamos );
	
	public Response<Reclamos> EditarReclamos(Integer id);
	
	public Response<Reclamos> EliminarReclamos(Integer id);
	
}
