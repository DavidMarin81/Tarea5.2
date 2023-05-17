package modelo.servicio.departamento;

import modelo.Departamento;
import modelo.dao.departamento.DepartamentoEXistDao;
import modelo.dao.departamento.IDepartamentoDao;
import modelo.exceptions.InstanceNotFoundException;

public class ServicioDepartamento implements IServicioDepartamento {

	private IDepartamentoDao departamentoDao;

	public ServicioDepartamento() {
		departamentoDao = new DepartamentoEXistDao();
	}



	@Override
	public Departamento read(long deptno) throws InstanceNotFoundException {
		return departamentoDao.read(deptno);
	}



	@Override
	public Departamento readByName(String dname) throws InstanceNotFoundException {
		return departamentoDao.readByName(dname);
	}

	@Override
	public int getTotalDepartamentos() {
		return departamentoDao.getTotalDepartamentos();
	}

}
