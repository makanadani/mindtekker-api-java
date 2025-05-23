-- Criação da sequência
CREATE SEQUENCE TB_FRASES_SEQ
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Criação da tabela
CREATE TABLE TB_FRASES (
    ID     INTEGER DEFAULT TB_FRASES_SEQ.nextval NOT NULL PRIMARY KEY,
    FRASE  VARCHAR2(500) NOT NULL,
    AUTOR  VARCHAR2(255)
);

INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.','Roberto Shinyashiki');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O sucesso é ir de fracasso em fracasso sem perder o entusiasmo.','Winston Churchill');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A vida é 10% o que acontece com você e 90% como você reage a isso.','Charles R. Swindoll');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Acredite em si próprio e chegará um dia em que os outros não terão outra escolha senão acreditar com você.','Cynthia Kersey');INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Mesmo que algo pareça impossível, não desista antes de tentar.','Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não espere por uma crise para descobrir o que é importante em sua vida.','Platão');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Coragem não é ausência do medo; é a persistência apesar do medo.','Nelson Mandela');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A força não provém da capacidade física. Provém de uma vontade indomável.','Mahatma Gandhi');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.','Píndaro');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Grandes realizações são possíveis quando se tem coragem para começar.','Zig Ziglar');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O que me preocupa não é o grito dos maus, mas o silêncio dos bons.', 'Martin Luther King Jr.');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se você quer alcançar a grandeza, pare de pedir permissão.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não é o mais forte que sobrevive, nem o mais inteligente, mas o que melhor se adapta às mudanças.', 'Charles Darwin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A jornada de mil milhas começa com o primeiro passo.', 'Lao Tsé');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A mente é tudo. Você se torna aquilo que você pensa.', 'Buda');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('É durante os momentos mais difíceis que devemos focar para ver a luz.', 'Aristóteles Onassis');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Seja a mudança que você quer ver no mundo.', 'Mahatma Gandhi');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A única maneira de fazer um excelente trabalho é amar o que você faz.', 'Steve Jobs');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Acredite que você pode, assim você já está no meio do caminho.', 'Theodore Roosevelt');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não importa o quão devagar você vá, desde que você não pare.', 'Confúcio');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Levante com determinação. Vá dormir com satisfação.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Tudo parece impossível até que esteja feito.', 'Nelson Mandela');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não espere por oportunidades extraordinárias. Aproveite as ocasiões comuns e as torne grandes.', 'Orison Swett Marden');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O futuro pertence àqueles que acreditam na beleza de seus sonhos.', 'Eleanor Roosevelt');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O maior prazer da vida é fazer o que as pessoas dizem que você não pode fazer.', 'Walter Bagehot');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O fracasso é apenas a oportunidade de começar de novo com mais inteligência.', 'Henry Ford');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A maior glória em viver não está em nunca cair, mas em levantar-se a cada queda.', 'Nelson Mandela');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você não é derrotado quando perde. Você é derrotado quando desiste.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não deseje que seja mais fácil, deseje ser melhor.', 'Jim Rohn');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A disciplina é a ponte entre metas e realizações.', 'Jim Rohn');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se você está atravessando o inferno, continue indo.', 'Winston Churchill');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('As grandes conquistas nascem de grandes sacrifícios.', 'Napoleão Bonaparte');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A dor é temporária. Desistir é para sempre.', 'Lance Armstrong');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Vá confiante na direção dos seus sonhos. Viva a vida que você imaginou.', 'Henry David Thoreau');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A felicidade não é algo pronto. Ela vem de suas próprias ações.', 'Dalai Lama');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você é o único responsável pela sua felicidade.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não conte os dias. Faça os dias contarem.', 'Muhammad Ali');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Transforme suas feridas em sabedoria.', 'Oprah Winfrey');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não seja empurrado por seus problemas. Seja guiado por seus sonhos.', 'Ralph Waldo Emerson');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A única limitação que você tem é aquela que você aceita.', 'Robin Sharma');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A ação é a chave fundamental para todo o sucesso.', 'Pablo Picasso');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não importa de onde você vem. O que importa é para onde você vai.', 'Brian Tracy');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não limite seus desafios. Desafie seus limites.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Tudo que você sempre quis está do outro lado do medo.', 'George Addair');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você nunca estará pronto. Comece mesmo assim.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Persistência realiza o impossível.', 'Provérbio Chinês');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A confiança em si mesmo é o primeiro segredo do sucesso.', 'Ralph Waldo Emerson');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Seja forte o suficiente para permanecer sozinho, esperto o suficiente para saber quando precisa de ajuda e corajoso o suficiente para pedir por ela.', 'Ziad Abdelnour');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Nunca é tarde demais para ser aquilo que você poderia ter sido.', 'George Eliot');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A maior aventura que você pode viver é viver a vida dos seus sonhos.', 'Oprah Winfrey');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se você pode sonhar, você pode fazer.', 'Walt Disney');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Pequenos passos em direção ao seu objetivo todos os dias somam uma grande distância.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você não precisa ser grande para começar, mas precisa começar para ser grande.', 'Zig Ziglar');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não existe sucesso sem esforço.', 'Sophocles');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O único lugar onde o sucesso vem antes do trabalho é no dicionário.', 'Vidal Sassoon');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O seu tempo é limitado, então não o desperdice vivendo a vida de outra pessoa.', 'Steve Jobs');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Sonhe grande e ouse falhar.', 'Norman Vaughan');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O fracasso derrota os fracos e inspira os fortes.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Seja o seu próprio herói todos os dias.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se não puder fazer tudo, faça tudo que puder.', 'Theodore Roosevelt');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A persistência é o caminho do êxito.', 'Charles Chaplin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Acredite, você tem forças para chegar onde quiser. Basta querer.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A sua maior conquista será superar a si mesmo.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não coloque limites em seus sonhos. Coloque fé.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Desistir nunca foi uma opção para os que têm propósito.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('As dificuldades preparam pessoas comuns para destinos extraordinários.', 'C.S. Lewis');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não espere por oportunidades. Crie-as.', 'George Bernard Shaw');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A única maneira de alcançar o impossível é acreditar que é possível.', 'Charles Kingsleigh');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Vencer é se levantar uma vez mais do que cair.', 'Oliver Goldsmith');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Seja tão bom que eles não possam te ignorar.', 'Steve Martin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O segredo do sucesso é começar antes de estar pronto.', 'Marie Forleo');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo.', 'José de Alencar');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Nenhum obstáculo será grande se a sua vontade de vencer for maior.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A melhor maneira de prever o futuro é criá-lo.', 'Peter Drucker');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você não é o que conquistou. Você é o que superou.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A sorte favorece a mente bem preparada.', 'Louis Pasteur');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Pense grande e ouse fracassar.', 'Norman Vaughan');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Nunca desista de um sonho só por causa do tempo que levará para realizá-lo. O tempo vai passar de qualquer forma.', 'Earl Nightingale');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Cada conquista começa com a decisão de tentar.', 'Gail Devers');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Motivação é o que faz você começar. Hábito é o que faz você continuar.', 'Jim Ryun');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não tenha medo da mudança. Coisas boas se vão para que melhores possam vir.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Quando você quer alguma coisa, todo o universo conspira para que você realize seu desejo.', 'Paulo Coelho');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não pare quando estiver cansado. Pare quando tiver terminado.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você não precisa de aprovação para ser incrível.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se você acredita, já está na metade do caminho.', 'Theodore Roosevelt');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A maior recompensa de nosso trabalho não é o que nos pagam por ele, mas aquilo em que ele nos transforma.', 'John Ruskin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você é mais corajoso do que acredita, mais forte do que parece e mais inteligente do que pensa.', 'Christopher Robin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não existe vento favorável para quem não sabe onde quer chegar.', 'Sêneca');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Confie no processo. Tudo tem o seu tempo.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A única maneira de fazer um ótimo trabalho é amar o que você faz.', 'Steve Jobs');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Você não é um produto das circunstâncias, mas sim das suas decisões.', 'Stephen Covey');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('O mundo está nas mãos daqueles que têm coragem de sonhar e correr o risco de viver seus sonhos.', 'Paulo Coelho');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('A coragem não é ausência de medo, é persistência apesar do medo.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Quanto maior a dificuldade, maior a glória em superá-la.', 'Epicuro');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Um passo de cada vez ainda é movimento.', 'Desconhecido');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Não se compare com os outros. Compare-se com quem você era ontem.', 'Jordan Peterson');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Quem olha para fora sonha, quem olha para dentro desperta.', 'Carl Jung');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Viver é enfrentar um problema atrás do outro. O modo como você o encara é que faz a diferença.', 'Benjamin Franklin');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Se você quer mudar o mundo, comece por você.', 'Mahatma Gandhi');
INSERT INTO TB_FRASES (FRASE, AUTOR) VALUES ('Ninguém é como você, e esse é o seu superpoder.', 'Desconhecido');



