import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private List<Equipamento> equipamentos = new LinkedList <Equipamento>();
    private List<Laboratorio> laboratorios = new LinkedList <Laboratorio>();
    
    public void addEquipamentos (Equipamento equipamento) {
        equipamentos.add(equipamento);    
    }
    public void addLaboratorio (Laboratorio laboratorio) {
        laboratorios.add(laboratorio);    
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<Laboratorio> getLaboratorio() {
        return laboratorios;
    }

    public void setLaboratorio(List<Laboratorio> laboratorio) {
        this.laboratorios = laboratorio;
    } 
}
