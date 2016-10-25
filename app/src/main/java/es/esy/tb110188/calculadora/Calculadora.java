package es.esy.tb110188.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends Activity {

    private EditText display;
    private EditText historico;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bvirgula;
    private Button badicao;
    private Button bsubtracao;
    private Button bmultiplicacao;
    private Button bdivisao;
    private Button bpotenciacao;
    private Button bporcentagem;
    private Button bigual;
    private Button blimpa;
    private Button bapaga;
    private int operacao;
    private int total;
    private int virgula;
    private double valor1;
    private double valor2;
    private double resultado = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        display = (EditText)findViewById(R.id.display);
        historico = (EditText)findViewById(R.id.historico);
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(listenThis);
        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(listenThis);
        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(listenThis);
        b4 = (Button)findViewById(R.id.b4);
        b4.setOnClickListener(listenThis);
        b5 = (Button)findViewById(R.id.b5);
        b5.setOnClickListener(listenThis);
        b6 = (Button)findViewById(R.id.b6);
        b6.setOnClickListener(listenThis);
        b7 = (Button)findViewById(R.id.b7);
        b7.setOnClickListener(listenThis);
        b8 = (Button)findViewById(R.id.b8);
        b8.setOnClickListener(listenThis);
        b9 = (Button)findViewById(R.id.b9);
        b9.setOnClickListener(listenThis);
        b0 = (Button)findViewById(R.id.b0);
        b0.setOnClickListener(listenThis);
        bvirgula = (Button)findViewById(R.id.bvirgula);
        bvirgula.setOnClickListener(listenThis);
        badicao = (Button)findViewById(R.id.badicao);
        badicao.setOnClickListener(listenThis);
        bsubtracao = (Button)findViewById(R.id.bsubtracao);
        bsubtracao.setOnClickListener(listenThis);
        bmultiplicacao = (Button)findViewById(R.id.bmultiplicacao);
        bmultiplicacao.setOnClickListener(listenThis);
        bdivisao = (Button)findViewById(R.id.bdivisao);
        bdivisao.setOnClickListener(listenThis);
        bpotenciacao = (Button)findViewById(R.id.bpotenciacao);
        bpotenciacao.setOnClickListener(listenThis);
        bporcentagem = (Button)findViewById(R.id.bporcentagem);
        bporcentagem.setOnClickListener(listenThis);
        bigual = (Button)findViewById(R.id.bigual);
        bigual.setOnClickListener(listenThis);
        blimpa = (Button)findViewById(R.id.blimpa);
        blimpa.setOnClickListener(listenThis);
        bapaga = (Button)findViewById(R.id.bapaga);
        bapaga.setOnClickListener(listenThis);

    }

    View.OnClickListener listenThis = new View.OnClickListener(){
        public void onClick(View v) {

            if (v.getId()==R.id.b1) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("1");
                } else {
                    display.setText(display.getText()+"1");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b2) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("2");
                } else {
                    display.setText(display.getText()+"2");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b3) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("3");
                } else {
                    display.setText(display.getText()+"3");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b4) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("4");
                } else {
                    display.setText(display.getText()+"4");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b5) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("5");
                } else {
                    display.setText(display.getText()+"5");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b6) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("6");
                } else {
                    display.setText(display.getText()+"6");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b7) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("7");
                } else {
                    display.setText(display.getText()+"7");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b8) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("8");
                } else {
                    display.setText(display.getText()+"8");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b9) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("9");
                } else {
                    display.setText(display.getText()+"9");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.b0) {
                if (Double.parseDouble(display.getText().toString())==0 && virgula!=1 || total==1) {
                    display.setText("0");
                } else {
                    display.setText(display.getText()+"0");
                }
                virgula = 0;
                total = 0;
            }

            if (v.getId()==R.id.bvirgula) {
                if (virgula!=1) {
                    if (Double.parseDouble(display.getText().toString())==0 || total==1) {
                        display.setText("0.");
                    } else {
                        display.setText(display.getText()+".");
                    }
                    virgula = 1;
                }
                total = 0;
            }


            if (v.getId()==R.id.badicao) {
                operacao = 1;
                valor1 = Double.parseDouble(display.getText().toString());
                total = 1;
                historico.setText(display.getText()+" + ");
            }

            if (v.getId()==R.id.bsubtracao) {
                operacao = 2;
                valor1 = Double.parseDouble(display.getText().toString());
                total = 1;
                historico.setText(display.getText()+" - ");
            }

            if (v.getId()==R.id.bmultiplicacao) {
                operacao = 3;
                valor1 = Double.parseDouble(display.getText().toString());
                total = 1;
                historico.setText(display.getText()+" x ");
            }

            if (v.getId()==R.id.bdivisao) {
                operacao = 4;
                valor1 = Double.parseDouble(display.getText().toString());
                total = 1;
                historico.setText(display.getText()+" / ");
            }

            if (v.getId()==R.id.bigual) {
                if (total==1) {
                    valor1 = Double.parseDouble(display.getText().toString());
                } else {
                    valor2 = Double.parseDouble(display.getText().toString());
                }
                historico.setText(historico.getText().toString()+display.getText().toString()+" = ");
                total = 1;
                if (operacao==1) {
                    resultado = valor1 + valor2;
                    if (resultado%1==0) {
                        display.setText(Integer.toString((int)resultado));
                    } else {
                        display.setText(Double.toString(resultado));
                    }
                }
                if (operacao==2) {
                    resultado = valor1 - valor2;
                    if (resultado%1==0) {
                        display.setText(Integer.toString((int)resultado));
                    } else {
                        display.setText(Double.toString(resultado));
                    }
                }
                if (operacao==3) {
                    resultado = valor1 * valor2;
                    if (resultado%1==0) {
                        display.setText(Integer.toString((int)resultado));
                    } else {
                        display.setText(Double.toString(resultado));
                    }
                }
                if (operacao==4) {
                    if (valor2==0) {
                        display.setText("Erro! Divisão por 0");
                    } else {
                        resultado = valor1 / valor2;
                        if (resultado%1==0) {
                            display.setText(Integer.toString((int)resultado));
                        } else {
                            display.setText(Double.toString(resultado));
                        }
                    }
                }
                if (operacao==5) {
                    if (valor2<0) {
                        valor2 = valor2 * -1;
                        for (int i = 1; i <= valor2; i++) { resultado = resultado * valor1; }
                        resultado = 1 / resultado;
                    } else {
                        for (int i = 1; i <= valor2; i++) { resultado = resultado * valor1; }
                    }
                    if (resultado%1==0) {
                        display.setText(Integer.toString((int)resultado));
                    } else {
                        display.setText(Double.toString(resultado));
                    }
                }
                resultado = 1;
                virgula = 0;
            }

            if (v.getId()==R.id.blimpa) {
                display.setText("0");
                historico.setText("");
                valor1 = 0;
                valor2 = 0;
                resultado = 1;
                virgula = 0;
                operacao = 0;
                total = 0;
            }

            if (v.getId()==R.id.bapaga) {
                if (display.getText().toString().length()>1) {
                    display.setText(display.getText().toString().substring(0, display.getText().toString().length() - 1));
                } else {
                    display.setText("0");
                }
            }

            if (v.getId()==R.id.bporcentagem) {

            }

            if (v.getId()==R.id.bpotenciacao) {
                operacao = 5;
                valor1 = Double.parseDouble(display.getText().toString());
                total = 1;
                historico.setText(display.getText()+" ^ ");
            }
        }
    };
}
