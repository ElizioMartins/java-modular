package digital.innovation.one.operacao.internal;

import digital.innovation.one.operacao.Operacao;

public class DivHelper implements Operacao {

    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
