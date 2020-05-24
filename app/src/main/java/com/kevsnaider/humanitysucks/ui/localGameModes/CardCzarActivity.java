package com.kevsnaider.humanitysucks.ui.localGameModes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.kevsnaider.humanitysucks.R;
import java.util.Locale;
import java.util.Random;

public class CardCzarActivity extends AppCompatActivity implements  View.OnClickListener {
    Random random = new Random();
    Integer card;
    String card_text, user_locale;
    String[] cards_en, cards_es, cards_ca;
    Button btn_new_card;
    TextView tv_czar_card, tv_pick_cards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_czar);

        user_locale = Locale.getDefault().getLanguage();
        initializeCardsArray();

        tv_czar_card = findViewById(R.id.tv_czar_card);
        tv_czar_card.setTextSize(22);
        tv_pick_cards = findViewById(R.id.tv_pick_cards);
        tv_pick_cards.setTextSize(17);

        btn_new_card = findViewById(R.id.btn_new_card);
        btn_new_card.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.btn_new_card)) {
            card_text = changeCardValue();
            tv_czar_card.setText(card_text);
        }
    }

    private String changeCardValue() {
        if (user_locale.equals("es")) {
            card = random.nextInt(cards_es.length);
            changePickValue(card);
            return cards_es[card];
        } else if (user_locale.equals("ca")) {
            card = random.nextInt(cards_ca.length);
            changePickValue(card);
            return cards_ca[card];
        } else {
            card = random.nextInt(cards_en.length);
            changePickValue(card);
            return cards_en[card];
        }
    }

    private void changePickValue(int card) {
        if (user_locale.equals("es")) {
            if (card == 5) {
            tv_pick_cards.setText("PICK (3)");
            } else if (card == 0 || card == 1 || card == 2 || card == 3) {
                tv_pick_cards.setText("PICK (2)");
            } else if (card == 8 || card == 10 || card == 11 || card == 12 || card == 15 ||
                       card == 16 || card == 18) {
                tv_pick_cards.setText("PICK (1)");
            } else  {
                tv_pick_cards.setText("");
            }
        } else if (user_locale.equals("ca")) {
            if (card == 5) {
                tv_pick_cards.setText("PICK (3)");
            } else if (card == 0 || card == 1 || card == 2 || card == 3) {
                tv_pick_cards.setText("PICK (2)");
            } else if (card == 8 || card == 10 || card == 11 || card == 12 || card == 15 ||
                       card == 16 || card == 18) {
                tv_pick_cards.setText("PICK (1)");
            } else  {
                tv_pick_cards.setText("");
            }
        } else {
            if (card == 19) {
                tv_pick_cards.setText("PICK (3)");
            } else if (card == 5 || card == 7 || card == 11 || card == 14) {
                tv_pick_cards.setText("PICK (2)");
            } else if (card == 0 || card == 1 || card == 3 || card == 4 || card == 6 || card == 8 ||
                       card == 10 || card == 12 || card == 13 || card == 15 || card == 16 || card == 18) {
                tv_pick_cards.setText("PICK (1)");
            } else  {
                tv_pick_cards.setText("");
            }
        }
    }

    private void initializeCardsArray() {
        cards_en = new String[]{"Hey Reddit! I’m\n__________________.\nAsk me anything.",
                "Introducing\nX-treme Baseball!\nIt’s like baseball,\nbut with __________!",
                "What is Batman’s\nguilty pleasure.",
                "TSA guidelines\nnow prohibit\n__________________\non airplanes.",
                "Next from\nJ.K. Rowling:\nHarry Potter and\nthe Chamber of\n__________________.",
                "That’s right, I killed\n_________________.\nHow, you ask?\n_________________.",
                "I’m sorry,\nProfessor, but I\ncouldn’t complete\nmy homework\nbecause of\n__________.",
                "And the Academy\nAward for\n__________________\ngoes to __________.",
                "Dude, do not go\nin that bathroom.\nThere’s __________\nin there.",
                "How did I lose\nmy virginity?",
                "It’s a pity that kids,\nthese days are all\ngetting involved\nwith _____________.",
                "Step 1: __________.\nStep 2: __________.\nStep 3: Profit.",
                "_________________.\nBetcha can’t have\njust one!",
                "Kids, I don’t need\ndrugs to get\nhigh. I’m high on\n__________.",
                "For my next trick, I\nwill pull __________\nout of ___________.",
                "While the United\nStates raced the Soviet\nUnion to the moon, the\nMexican government\nfunneled millions of\npesos into research on\n_____________________.",
                "In the Disney\nChannel Original\nMovie, Hannah\nMontana struggles\nwith _____________\nfor the first time.",
                "What’s my\nsecret power?",
                "I’m going on\na cleanse this\nweek. Nothing\nbut kale juice and\n__________________.",
                "________ + ________\n= ________________."
        };

        cards_es = new String[] {
                "Así es, yo maté a\n_________________.\n¿Que cómo lo\nhice? _________________.",
                "Y el premio de\nla academia por\n__________________\nes para __________.",
                "En mi próximo\n truco, sacaré\n_______________\nde ___________.",
                "Canal Historia\npresenta:\n__________________,\nla historia de\n______________.",
                "¿Cuál es la\npróxima pareja\nde superhéroes?",
                "Haz un haiku.",
                "¿Qué es lo más\ncrujiente?",
                "¿A qué huelen\nlas personas\nmayores?",
                "_____________:\nprobado en\nniños, aprobado\npor las madres.",
                "¿Qué mejora con\nlos años?",
                "Lo siento, acabo\nde ________________.",
                "A los blancos les\ngusta ______________.",
                "La vida era difícil\npara los\ncavernícolas\nantes de\n_________________.",
                "¿Quién ha\nrobado las\ngalletas del tarro\nde las galletas?",
                "¿Qué es lo más\nemo?",
                "Antes de matarle,\nSeñor Bond,\nme gustaria\nenseñarle\n_________________.",
                "La excursión al\ncampo fue\ncompletamente\narruinada por\n_____________.",
                "¿Qué es el\nmejor amigo de\nuna chica?",
                "Los estudios\ndemuestran que las\nratas de laboratorio\nresuelven laberintos\nun 50% más rápido\ntras ser expuestas a\n________________.",
                "¿Qué me han\nestado ocultando\nmis padres?"
        };

        cards_ca = new String[] {
                "Així és, jo vaig matar a\n_________________.\nQue com ho vaig\nfer? _________________.",
                "I el premi de\nl'acadèmia per\n__________________\nés per __________.",
                "En el meu pròxim\ntruc, trauré\n_______________\nde ___________.",
                "Canal Història\npresenta:\n__________________,\nla història de\n______________.",
                "Quina és la\npropera parella\nde superherois?",
                "Fes un haiku.",
                "¿Què és el més\ncruixent?",
                "A què fan olor\nles persones grans?",
                "_____________:\nprovat en\nnens, aprovat\nper les mares.",
                "Què millora amb\nels anys?",
                "Ho sento, acabo\nde ________________.",
                "Als blancs els\nagrada ______________.",
                "La vida era difícil\nper als\ncavernícoles\nabans de\n_________________.",
                "Qui ha\nrobat les\ngaletes del pot\nde les galetes?",
                "¿Què és el més\nemo?",
                "Abans de matar-lo,\nSenyor Bond,\nm'agradaria\nensenyar-li\n_________________.",
                "L'excursió al\ncamp va ser\ncompletament\narruïnada per\n_____________.",
                "Què és el\nmillor amic d'una noia?",
                "Els estudis\ndemostren que les\nrates de laboratori\nresolen laberints\nun 50% més ràpid\ndesprés de ser exposades a\n________________.",
                "Què m'han\nestat ocultant\nels meus pares?"
        };
    }
}
