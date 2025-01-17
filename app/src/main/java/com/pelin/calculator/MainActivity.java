package com.pelin.calculator;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvDisp;
    Button equals;
    private long mLastClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvDisp = findViewById(R.id.display);
        equals = findViewById(R.id.btnEquals);

    }

    public void inputNum(View v) {
        int start = tvDisp.getLayout().getLineStart(0);
        int end = tvDisp.getLayout().getLineEnd(0);
        String length = tvDisp.getText().subSequence(start, end).toString();

        if (v.getId() == R.id.btn1) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "1";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "1";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn2) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "2";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "2";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn3) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "3";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "3";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn4) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "4";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "4";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn5) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "5";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "5";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn6) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "6";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "6";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn7) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "7";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "7";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn8) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "8";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "8";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btn9) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "9";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "9";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnAdd) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "+";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "+";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnSub) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "-";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "-";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnDec) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += ".";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += ".";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnDiv) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "/";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "/";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnMult) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "*";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "*";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnClear) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                tvDisp.setText("");
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
            }
        } else if (v.getId() == R.id.btnOpenPar) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "(`";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnClosePar) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += ")";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += ")";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnRoot) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "sqrt(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "sqrt(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnSin) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "sin(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "sin(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnCos) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "cos(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "cos(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnTan) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "tan(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "tan(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnExpo) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "^";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "^";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnZero) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "0";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "0";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnPercent) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "%";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "%";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnFac) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "!";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "!";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnPi) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "π";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "π";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnEuler) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "e";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "e";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnLog) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "log(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "log(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnNaturalLog) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "ln(";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "ln(";
                tvDisp.setText(input);
            }
        } else if (v.getId() == R.id.btnNegative) {
            if (tvDisp.getLayout().getLineCount() == 1) {
                length += "-";
                tvDisp.setText(length);
            } else if (tvDisp.getLayout().getLineCount() == 2) {
                tvDisp.setText("");
                int repeatStart = tvDisp.getLayout().getLineStart(0);
                int repeatEnd = tvDisp.getLayout().getLineEnd(0);
                String input = tvDisp.getText().subSequence(repeatStart, repeatEnd).toString();

                input += "-";
                tvDisp.setText(input);
            }
        }
    }

    public void deleteLastInput(View v) {
        int start = tvDisp.getLayout().getLineStart(0);
        int end = tvDisp.getLayout().getLineEnd(0);
        String input = tvDisp.getText().subSequence(start, end).toString();

        if (!input.isEmpty()) {
            StringBuffer del = new StringBuffer(input);
            del.deleteCharAt(del.length() - 1);
            tvDisp.setText(del);
        }
    }

    public void calculate(View v) {

        findViewById(R.id.btnEquals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();

                if (tvDisp.getLineCount() == 1) {
                    Double result = parse(tvDisp.getText().toString());
                    String input = tvDisp.getText().toString() + "\n" + result;
                    tvDisp.setText(input);
                }
            }
        });
    }

    public Double parse(String input) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < input.length()) ? input.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                try {
                    if (pos < input.length());
                } catch (RuntimeException e) {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)` | number
            //        | functionName `(` expression `)` | functionName factor
            //        | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                double x = 0;
                try {
                    if (eat('+')) return +parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        try {
                            if (!eat(')')) ;
                        } catch (RuntimeException e) {
                            throw new RuntimeException("Missing ')'", e);
                        }
                    } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(input.substring(startPos, this.pos));
                    } else if (ch >= 'a' && ch <= 'z') { // functions
                        while (ch >= 'a' && ch <= 'z') nextChar();
                        String func = input.substring(startPos, this.pos);
                        if (eat('(')) {
                            x = parseExpression();
                            try {
                                if (!eat(')')) ;
                            } catch (RuntimeException e) {
                                throw new RuntimeException("Missing ')' after argument to " + func, e);
                            }
                        } else {
                            x = parseFactor();
                        }
                        try {
                            switch (func) {
                                case "sqrt":
                                    x = Math.sqrt(x);
                                    break;
                                case "sin":
                                    x = Math.sin(Math.toRadians(x));
                                    break;
                                case "cos":
                                    x = Math.cos(Math.toRadians(x));
                                    break;
                                case "tan":
                                    x = Math.tan(Math.toRadians(x));
                                    break;
                                case "log":
                                    x = Math.log10(x);
                                    break;
                                case "ln":
                                    x = Math.log(x);
                                    break;
                                case "e":
                                    x = Math.E;
                                    break;
                            }
                        } catch (RuntimeException e) {
                            throw new RuntimeException("Unknown function: " + func);
                        }
                    }
                    if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                    if (eat('%')) x = x / 100; //percentage
                    if (eat('!')) x = factorial(x);
                    if (eat('π')) x = Math.PI;
                } catch (RuntimeException e) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }

            double factorial(double num) {
                double i = 1;
                long factorial = 1;
                while (i <= num) {
                    factorial *= (long) i;
                    i++;
                }
                return factorial;
            }
        }.parse();
    }
}