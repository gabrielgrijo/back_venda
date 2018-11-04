package back_vendas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import back_vendas.model.Acessorios;
import back_vendas.model.TipoVeiculo;
import back_vendas.service.AcessoriosService;
import back_vendas.service.TipoVeiculoService;



@RestController
@CrossOrigin("*")
public class TipoVeiculosController {
	
	@Autowired
	private TipoVeiculoService tipoVeiculoService;
	
	@GetMapping("/tipoveiculos")
	public List<TipoVeiculo> buscarTodos(){
		return tipoVeiculoService.list();
	}
	
	@PostMapping("/tipoveiculos")
	public void salvar(@RequestBody TipoVeiculo tipoVeiculo){
		tipoVeiculoService.create(tipoVeiculo);
	}

	@PutMapping("/tipoveiculos")
	public void alterar(@RequestBody TipoVeiculo tipoVeiculo){
		tipoVeiculoService.create(tipoVeiculo);
	}
	
	@DeleteMapping("/tipoveiculos/{id}")
	public void remover(@PathVariable(value = "id") long id){
		tipoVeiculoService.delete(id);
	}

}