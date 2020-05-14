import dominio.Veiculo;
import util.JpaUtil;

import javax.persistence.EntityManager;

public class BuscandoVeiculo {

    public static void main(String[] args) {
        EntityManager manager = JpaUtil.getEntityManager();

        Veiculo veiculo = manager.find(Veiculo.class, 1L);

        System.out.println("Veículo de código " + veiculo.getCodigo()
                + " é um " + veiculo.getModelo());

        manager.close();
        JpaUtil.close();
    }
}
