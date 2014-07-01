/********************************************************************************
** Form generated from reading ui file 'ConvertidorBase.jui'
**
** Created: sá. 14. jun. 15:10:50 2014
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_ConvertidorBase implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actSal;
    public QWidget centralwidget;
    public QLabel convLabel;
    public QPushButton clear;
    public QLineEdit convLineEdit;
    public QRadioButton binarioRadio;
    public QRadioButton hexaRadio;
    public QRadioButton deciRadio;
    public QRadioButton octalRadio;
    public QLabel deLabel;
    public QLabel aLabel;
    public QFrame line;
    public QLabel deciLabel;
    public QLabel hexaLabel;
    public QLabel valorDecLabel;
    public QLabel valorHexaLabel;
    public QLabel octalLabel;
    public QLabel binLabel;
    public QLabel valorOctLabel;
    public QLabel valorBinLabel;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuAyuda;

    public Ui_ConvertidorBase() { super(); }

    public void setupUi(QMainWindow ConvertidorBase)
    {
        ConvertidorBase.setObjectName("ConvertidorBase");
        ConvertidorBase.resize(new QSize(400, 320).expandedTo(ConvertidorBase.minimumSizeHint()));
        actSal = new QAction(ConvertidorBase);
        actSal.setObjectName("actSal");
        centralwidget = new QWidget(ConvertidorBase);
        centralwidget.setObjectName("centralwidget");
        convLabel = new QLabel(centralwidget);
        convLabel.setObjectName("convLabel");
        convLabel.setGeometry(new QRect(50, 30, 46, 14));
        clear = new QPushButton(centralwidget);
        clear.setObjectName("clear");
        clear.setGeometry(new QRect(310, 30, 41, 41));
        clear.setIcon(new QIcon(new QPixmap("classpath:icons/Clear.png")));
        clear.setIconSize(new QSize(48, 48));
        clear.setFlat(true);
        convLineEdit = new QLineEdit(centralwidget);
        convLineEdit.setObjectName("convLineEdit");
        convLineEdit.setGeometry(new QRect(110, 30, 171, 20));
        binarioRadio = new QRadioButton(centralwidget);
        binarioRadio.setObjectName("binarioRadio");
        binarioRadio.setGeometry(new QRect(110, 80, 82, 19));
        hexaRadio = new QRadioButton(centralwidget);
        hexaRadio.setObjectName("hexaRadio");
        hexaRadio.setGeometry(new QRect(200, 80, 82, 19));
        deciRadio = new QRadioButton(centralwidget);
        deciRadio.setObjectName("deciRadio");
        deciRadio.setGeometry(new QRect(110, 120, 82, 19));
        deciRadio.setChecked(true);
        octalRadio = new QRadioButton(centralwidget);
        octalRadio.setObjectName("octalRadio");
        octalRadio.setGeometry(new QRect(200, 120, 82, 19));
        deLabel = new QLabel(centralwidget);
        deLabel.setObjectName("deLabel");
        deLabel.setGeometry(new QRect(70, 80, 21, 16));
        aLabel = new QLabel(centralwidget);
        aLabel.setObjectName("aLabel");
        aLabel.setGeometry(new QRect(70, 150, 16, 16));
        line = new QFrame(centralwidget);
        line.setObjectName("line");
        line.setGeometry(new QRect(90, 150, 201, 16));
        line.setFrameShape(QFrame.Shape.HLine);
        line.setFrameShadow(QFrame.Shadow.Sunken);
        deciLabel = new QLabel(centralwidget);
        deciLabel.setObjectName("deciLabel");
        deciLabel.setGeometry(new QRect(40, 180, 41, 16));
        hexaLabel = new QLabel(centralwidget);
        hexaLabel.setObjectName("hexaLabel");
        hexaLabel.setGeometry(new QRect(20, 210, 71, 16));
        valorDecLabel = new QLabel(centralwidget);
        valorDecLabel.setObjectName("valorDecLabel");
        valorDecLabel.setGeometry(new QRect(100, 180, 231, 16));
        valorHexaLabel = new QLabel(centralwidget);
        valorHexaLabel.setObjectName("valorHexaLabel");
        valorHexaLabel.setGeometry(new QRect(100, 210, 231, 16));
        octalLabel = new QLabel(centralwidget);
        octalLabel.setObjectName("octalLabel");
        octalLabel.setGeometry(new QRect(50, 240, 31, 16));
        binLabel = new QLabel(centralwidget);
        binLabel.setObjectName("binLabel");
        binLabel.setGeometry(new QRect(50, 270, 41, 16));
        valorOctLabel = new QLabel(centralwidget);
        valorOctLabel.setObjectName("valorOctLabel");
        valorOctLabel.setGeometry(new QRect(100, 240, 231, 20));
        valorBinLabel = new QLabel(centralwidget);
        valorBinLabel.setObjectName("valorBinLabel");
        valorBinLabel.setGeometry(new QRect(100, 270, 231, 16));
        ConvertidorBase.setCentralWidget(centralwidget);
        menubar = new QMenuBar(ConvertidorBase);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 400, 21));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuAyuda = new QMenu(menubar);
        menuAyuda.setObjectName("menuAyuda");
        ConvertidorBase.setMenuBar(menubar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuAyuda.menuAction());
        menuArchivo.addAction(actSal);
        retranslateUi(ConvertidorBase);

        ConvertidorBase.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow ConvertidorBase)
    {
        ConvertidorBase.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "MainWindow", null));
        actSal.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "&Salir", null));
        actSal.setShortcut(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Ctrl+Q", null));
        convLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Convertir", null));
        clear.setText("");
        binarioRadio.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Binario", null));
        hexaRadio.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Hexadecimal", null));
        deciRadio.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Decimal", null));
        octalRadio.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Octal", null));
        deLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "De", null));
        aLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "A", null));
        deciLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Decimal:", null));
        hexaLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Hexadecimal:", null));
        valorDecLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "0", null));
        valorHexaLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "0", null));
        octalLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Octal:", null));
        binLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Binario:", null));
        valorOctLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "0", null));
        valorBinLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "0", null));
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Archivo", null));
        menuAyuda.setTitle(com.trolltech.qt.core.QCoreApplication.translate("ConvertidorBase", "Ayuda", null));
    } // retranslateUi

}

