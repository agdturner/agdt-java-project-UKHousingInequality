/**
 * Source code generated by uk.ac.leeds.ccg.andyt.projects.wigb.process.WIGB_JavaCodeGenerator
 */
package uk.ac.leeds.ccg.andyt.projects.wigb.data.waas.hhold;
public class WIGB_WaAS_Wave2_HHOLD_Record extends WIGB_WaAS_Wave1Or2_HHOLD_Record {
protected int BUYLGDST_SUM;
protected short CASEW2;
protected int DVBLTDEBT;
protected int DVBLTVAL;
protected int DVNWFLN_SUM;
protected int DVNWILN_SUM;
protected byte EQNEW;
protected byte EQNEW_I;
protected boolean EQNEW_IFLAG;
protected byte EQOLD;
protected byte EQOLD_I;
protected boolean EQOLD_IFLAG;
protected boolean EQREAS5;
protected boolean EQREAS6;
protected boolean EQREAS7;
protected boolean EQREAS8;
protected boolean EQREAS9;
protected byte HEXT1;
protected byte HEXT2;
protected byte HEXT3;
protected byte HEXT4;
protected byte HRPDVAGEW2BAND;
protected boolean H_FLAG1;
protected boolean H_FLAG2;
protected byte H_FLAG4;
protected boolean H_FLAG5;
protected int MARRSV;
protected int MARRSV2;
protected short MARRSV3;
protected byte MCHGE;
protected byte MCHGENUM;
protected boolean MENDV10;
protected short MENDV12;
protected short MENDV13;
protected boolean MENDV14;
protected boolean MENDV15;
protected boolean MENDV9;
protected boolean MENDVB10;
protected boolean MENDVB12;
protected boolean MENDVB13;
protected boolean MENDVB14;
protected boolean MENDVB15;
protected boolean MENDVB9;
protected boolean MENDY10;
protected boolean MENDY12;
protected boolean MENDY13;
protected boolean MENDY14;
protected boolean MENDY15;
protected boolean MENDY9;
protected byte MEND___W2;
protected byte MEXTN;
protected byte MEXTRS1;
protected byte MEXTRS2;
protected byte MEXTRS3;
protected byte MEXTRS4;
protected boolean MEXTRS5;
protected boolean MEXTRS6;
protected boolean MEXTRS7;
protected boolean MEXTRS8;
protected boolean MEXTRS9;
protected boolean MINC10;
protected boolean MINC13;
protected boolean MINC14;
protected boolean MINC15;
protected byte MNUMBN;
protected byte MNUMBN_I;
protected boolean MNUMBN_IFLAG;
protected byte MNUMBO;
protected byte MNUMBO_I;
protected boolean MNUMBO_IFLAG;
protected byte MORTID;
protected boolean MORTID2;
protected boolean MORTID3;
protected byte MREAS14;
protected boolean MREAS15;
protected byte MREAS24;
protected byte MVALB2_I;
protected boolean MVALB2_IFLAG;
protected byte MW1CHK1;
protected byte MW1CHK2;
protected byte MW1CHK3;
protected byte MYIFCH;
protected byte MYIFCH2;
protected byte MYIFCH3;
protected byte NOUNITS;
protected byte NUMDEPCH_HH;
protected boolean NUMNDEP;
protected byte VCADD;
protected byte VCADDN;
protected byte VPERS_I;
protected boolean VPERS_IFLAG;
protected double XS_CALWGT;
protected final void initBUYLGDST_SUM(String s) {
if (!s.trim().isEmpty()) {
BUYLGDST_SUM = Integer.parseInt(s);
} else {
BUYLGDST_SUM = Integer.MIN_VALUE;
}
}

protected final void initCASEW2(String s) {
if (!s.trim().isEmpty()) {
CASEW2 = Short.parseShort(s);
} else {
CASEW2 = Short.MIN_VALUE;
}
}

protected final void initDVBLTDEBT(String s) {
if (!s.trim().isEmpty()) {
DVBLTDEBT = Integer.parseInt(s);
} else {
DVBLTDEBT = Integer.MIN_VALUE;
}
}

protected final void initDVBLTVAL(String s) {
if (!s.trim().isEmpty()) {
DVBLTVAL = Integer.parseInt(s);
} else {
DVBLTVAL = Integer.MIN_VALUE;
}
}

protected final void initDVNWFLN_SUM(String s) {
if (!s.trim().isEmpty()) {
DVNWFLN_SUM = Integer.parseInt(s);
} else {
DVNWFLN_SUM = Integer.MIN_VALUE;
}
}

protected final void initDVNWILN_SUM(String s) {
if (!s.trim().isEmpty()) {
DVNWILN_SUM = Integer.parseInt(s);
} else {
DVNWILN_SUM = Integer.MIN_VALUE;
}
}

protected final void initEQNEW(String s) {
if (!s.trim().isEmpty()) {
EQNEW = Byte.parseByte(s);
} else {
EQNEW = Byte.MIN_VALUE;
}
}

protected final void initEQNEW_I(String s) {
if (!s.trim().isEmpty()) {
EQNEW_I = Byte.parseByte(s);
} else {
EQNEW_I = Byte.MIN_VALUE;
}
}

protected final void initEQNEW_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
EQNEW_IFLAG = false;
} else {
EQNEW_IFLAG = true;
}
}
}

protected final void initEQOLD(String s) {
if (!s.trim().isEmpty()) {
EQOLD = Byte.parseByte(s);
} else {
EQOLD = Byte.MIN_VALUE;
}
}

protected final void initEQOLD_I(String s) {
if (!s.trim().isEmpty()) {
EQOLD_I = Byte.parseByte(s);
} else {
EQOLD_I = Byte.MIN_VALUE;
}
}

protected final void initEQOLD_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
EQOLD_IFLAG = false;
} else {
EQOLD_IFLAG = true;
}
}
}

protected final void initEQREAS5(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
EQREAS5 = false;
} else {
EQREAS5 = true;
}
}
}

protected final void initEQREAS6(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
EQREAS6 = false;
} else {
EQREAS6 = true;
}
}
}

protected final void initEQREAS7(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
EQREAS7 = false;
} else {
EQREAS7 = true;
}
}
}

protected final void initEQREAS8(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
EQREAS8 = false;
} else {
EQREAS8 = true;
}
}
}

protected final void initEQREAS9(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
EQREAS9 = false;
} else {
EQREAS9 = true;
}
}
}

protected final void initHEXT1(String s) {
if (!s.trim().isEmpty()) {
HEXT1 = Byte.parseByte(s);
} else {
HEXT1 = Byte.MIN_VALUE;
}
}

protected final void initHEXT2(String s) {
if (!s.trim().isEmpty()) {
HEXT2 = Byte.parseByte(s);
} else {
HEXT2 = Byte.MIN_VALUE;
}
}

protected final void initHEXT3(String s) {
if (!s.trim().isEmpty()) {
HEXT3 = Byte.parseByte(s);
} else {
HEXT3 = Byte.MIN_VALUE;
}
}

protected final void initHEXT4(String s) {
if (!s.trim().isEmpty()) {
HEXT4 = Byte.parseByte(s);
} else {
HEXT4 = Byte.MIN_VALUE;
}
}

protected final void initHRPDVAGEW2BAND(String s) {
if (!s.trim().isEmpty()) {
HRPDVAGEW2BAND = Byte.parseByte(s);
} else {
HRPDVAGEW2BAND = Byte.MIN_VALUE;
}
}

protected final void initH_FLAG1(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 1) {
H_FLAG1 = false;
} else {
H_FLAG1 = true;
}
}
}

protected final void initH_FLAG2(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 1) {
H_FLAG2 = false;
} else {
H_FLAG2 = true;
}
}
}

protected final void initH_FLAG4(String s) {
if (!s.trim().isEmpty()) {
H_FLAG4 = Byte.parseByte(s);
} else {
H_FLAG4 = Byte.MIN_VALUE;
}
}

protected final void initH_FLAG5(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 1) {
H_FLAG5 = false;
} else {
H_FLAG5 = true;
}
}
}

protected final void initMARRSV(String s) {
if (!s.trim().isEmpty()) {
MARRSV = Integer.parseInt(s);
} else {
MARRSV = Integer.MIN_VALUE;
}
}

protected final void initMARRSV2(String s) {
if (!s.trim().isEmpty()) {
MARRSV2 = Integer.parseInt(s);
} else {
MARRSV2 = Integer.MIN_VALUE;
}
}

protected final void initMARRSV3(String s) {
if (!s.trim().isEmpty()) {
MARRSV3 = Short.parseShort(s);
} else {
MARRSV3 = Short.MIN_VALUE;
}
}

protected final void initMCHGE(String s) {
if (!s.trim().isEmpty()) {
MCHGE = Byte.parseByte(s);
} else {
MCHGE = Byte.MIN_VALUE;
}
}

protected final void initMCHGENUM(String s) {
if (!s.trim().isEmpty()) {
MCHGENUM = Byte.parseByte(s);
} else {
MCHGENUM = Byte.MIN_VALUE;
}
}

protected final void initMENDV10(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDV10 = false;
} else {
MENDV10 = true;
}
}
}

protected final void initMENDV12(String s) {
if (!s.trim().isEmpty()) {
MENDV12 = Short.parseShort(s);
} else {
MENDV12 = Short.MIN_VALUE;
}
}

protected final void initMENDV13(String s) {
if (!s.trim().isEmpty()) {
MENDV13 = Short.parseShort(s);
} else {
MENDV13 = Short.MIN_VALUE;
}
}

protected final void initMENDV14(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDV14 = false;
} else {
MENDV14 = true;
}
}
}

protected final void initMENDV15(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDV15 = false;
} else {
MENDV15 = true;
}
}
}

protected final void initMENDV9(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDV9 = false;
} else {
MENDV9 = true;
}
}
}

protected final void initMENDVB10(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB10 = false;
} else {
MENDVB10 = true;
}
}
}

protected final void initMENDVB12(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB12 = false;
} else {
MENDVB12 = true;
}
}
}

protected final void initMENDVB13(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB13 = false;
} else {
MENDVB13 = true;
}
}
}

protected final void initMENDVB14(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB14 = false;
} else {
MENDVB14 = true;
}
}
}

protected final void initMENDVB15(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB15 = false;
} else {
MENDVB15 = true;
}
}
}

protected final void initMENDVB9(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDVB9 = false;
} else {
MENDVB9 = true;
}
}
}

protected final void initMENDY10(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY10 = false;
} else {
MENDY10 = true;
}
}
}

protected final void initMENDY12(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY12 = false;
} else {
MENDY12 = true;
}
}
}

protected final void initMENDY13(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY13 = false;
} else {
MENDY13 = true;
}
}
}

protected final void initMENDY14(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY14 = false;
} else {
MENDY14 = true;
}
}
}

protected final void initMENDY15(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY15 = false;
} else {
MENDY15 = true;
}
}
}

protected final void initMENDY9(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MENDY9 = false;
} else {
MENDY9 = true;
}
}
}

protected final void initMEND___W2(String s) {
if (!s.trim().isEmpty()) {
MEND___W2 = Byte.parseByte(s);
} else {
MEND___W2 = Byte.MIN_VALUE;
}
}

protected final void initMEXTN(String s) {
if (!s.trim().isEmpty()) {
MEXTN = Byte.parseByte(s);
} else {
MEXTN = Byte.MIN_VALUE;
}
}

protected final void initMEXTRS1(String s) {
if (!s.trim().isEmpty()) {
MEXTRS1 = Byte.parseByte(s);
} else {
MEXTRS1 = Byte.MIN_VALUE;
}
}

protected final void initMEXTRS2(String s) {
if (!s.trim().isEmpty()) {
MEXTRS2 = Byte.parseByte(s);
} else {
MEXTRS2 = Byte.MIN_VALUE;
}
}

protected final void initMEXTRS3(String s) {
if (!s.trim().isEmpty()) {
MEXTRS3 = Byte.parseByte(s);
} else {
MEXTRS3 = Byte.MIN_VALUE;
}
}

protected final void initMEXTRS4(String s) {
if (!s.trim().isEmpty()) {
MEXTRS4 = Byte.parseByte(s);
} else {
MEXTRS4 = Byte.MIN_VALUE;
}
}

protected final void initMEXTRS5(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MEXTRS5 = false;
} else {
MEXTRS5 = true;
}
}
}

protected final void initMEXTRS6(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MEXTRS6 = false;
} else {
MEXTRS6 = true;
}
}
}

protected final void initMEXTRS7(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MEXTRS7 = false;
} else {
MEXTRS7 = true;
}
}
}

protected final void initMEXTRS8(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MEXTRS8 = false;
} else {
MEXTRS8 = true;
}
}
}

protected final void initMEXTRS9(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MEXTRS9 = false;
} else {
MEXTRS9 = true;
}
}
}

protected final void initMINC10(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MINC10 = false;
} else {
MINC10 = true;
}
}
}

protected final void initMINC13(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MINC13 = false;
} else {
MINC13 = true;
}
}
}

protected final void initMINC14(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MINC14 = false;
} else {
MINC14 = true;
}
}
}

protected final void initMINC15(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MINC15 = false;
} else {
MINC15 = true;
}
}
}

protected final void initMNUMBN(String s) {
if (!s.trim().isEmpty()) {
MNUMBN = Byte.parseByte(s);
} else {
MNUMBN = Byte.MIN_VALUE;
}
}

protected final void initMNUMBN_I(String s) {
if (!s.trim().isEmpty()) {
MNUMBN_I = Byte.parseByte(s);
} else {
MNUMBN_I = Byte.MIN_VALUE;
}
}

protected final void initMNUMBN_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
MNUMBN_IFLAG = false;
} else {
MNUMBN_IFLAG = true;
}
}
}

protected final void initMNUMBO(String s) {
if (!s.trim().isEmpty()) {
MNUMBO = Byte.parseByte(s);
} else {
MNUMBO = Byte.MIN_VALUE;
}
}

protected final void initMNUMBO_I(String s) {
if (!s.trim().isEmpty()) {
MNUMBO_I = Byte.parseByte(s);
} else {
MNUMBO_I = Byte.MIN_VALUE;
}
}

protected final void initMNUMBO_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
MNUMBO_IFLAG = false;
} else {
MNUMBO_IFLAG = true;
}
}
}

protected final void initMORTID(String s) {
if (!s.trim().isEmpty()) {
MORTID = Byte.parseByte(s);
} else {
MORTID = Byte.MIN_VALUE;
}
}

protected final void initMORTID2(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MORTID2 = false;
} else {
MORTID2 = true;
}
}
}

protected final void initMORTID3(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MORTID3 = false;
} else {
MORTID3 = true;
}
}
}

protected final void initMREAS14(String s) {
if (!s.trim().isEmpty()) {
MREAS14 = Byte.parseByte(s);
} else {
MREAS14 = Byte.MIN_VALUE;
}
}

protected final void initMREAS15(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == -7) {
MREAS15 = false;
} else {
MREAS15 = true;
}
}
}

protected final void initMREAS24(String s) {
if (!s.trim().isEmpty()) {
MREAS24 = Byte.parseByte(s);
} else {
MREAS24 = Byte.MIN_VALUE;
}
}

protected final void initMVALB2_I(String s) {
if (!s.trim().isEmpty()) {
MVALB2_I = Byte.parseByte(s);
} else {
MVALB2_I = Byte.MIN_VALUE;
}
}

protected final void initMVALB2_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
MVALB2_IFLAG = false;
} else {
MVALB2_IFLAG = true;
}
}
}

protected final void initMW1CHK1(String s) {
if (!s.trim().isEmpty()) {
MW1CHK1 = Byte.parseByte(s);
} else {
MW1CHK1 = Byte.MIN_VALUE;
}
}

protected final void initMW1CHK2(String s) {
if (!s.trim().isEmpty()) {
MW1CHK2 = Byte.parseByte(s);
} else {
MW1CHK2 = Byte.MIN_VALUE;
}
}

protected final void initMW1CHK3(String s) {
if (!s.trim().isEmpty()) {
MW1CHK3 = Byte.parseByte(s);
} else {
MW1CHK3 = Byte.MIN_VALUE;
}
}

protected final void initMYIFCH(String s) {
if (!s.trim().isEmpty()) {
MYIFCH = Byte.parseByte(s);
} else {
MYIFCH = Byte.MIN_VALUE;
}
}

protected final void initMYIFCH2(String s) {
if (!s.trim().isEmpty()) {
MYIFCH2 = Byte.parseByte(s);
} else {
MYIFCH2 = Byte.MIN_VALUE;
}
}

protected final void initMYIFCH3(String s) {
if (!s.trim().isEmpty()) {
MYIFCH3 = Byte.parseByte(s);
} else {
MYIFCH3 = Byte.MIN_VALUE;
}
}

protected final void initNOUNITS(String s) {
if (!s.trim().isEmpty()) {
NOUNITS = Byte.parseByte(s);
} else {
NOUNITS = Byte.MIN_VALUE;
}
}

protected final void initNUMDEPCH_HH(String s) {
if (!s.trim().isEmpty()) {
NUMDEPCH_HH = Byte.parseByte(s);
} else {
NUMDEPCH_HH = Byte.MIN_VALUE;
}
}

protected final void initNUMNDEP(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
NUMNDEP = false;
} else {
NUMNDEP = true;
}
}
}

protected final void initVCADD(String s) {
if (!s.trim().isEmpty()) {
VCADD = Byte.parseByte(s);
} else {
VCADD = Byte.MIN_VALUE;
}
}

protected final void initVCADDN(String s) {
if (!s.trim().isEmpty()) {
VCADDN = Byte.parseByte(s);
} else {
VCADDN = Byte.MIN_VALUE;
}
}

protected final void initVPERS_I(String s) {
if (!s.trim().isEmpty()) {
VPERS_I = Byte.parseByte(s);
} else {
VPERS_I = Byte.MIN_VALUE;
}
}

protected final void initVPERS_IFLAG(String s) {
if (!s.trim().isEmpty()) {
byte b = Byte.parseByte(s);
if (b == 0) {
VPERS_IFLAG = false;
} else {
VPERS_IFLAG = true;
}
}
}

protected final void initXS_CALWGT(String s) {
if (!s.trim().isEmpty()) {
XS_CALWGT = Double.parseDouble(s);
} else {
XS_CALWGT = Double.NaN;
}
}

public int getBUYLGDST_SUM() {
return BUYLGDST_SUM;
}

public short getCASEW2() {
return CASEW2;
}

public int getDVBLTDEBT() {
return DVBLTDEBT;
}

public int getDVBLTVAL() {
return DVBLTVAL;
}

public int getDVNWFLN_SUM() {
return DVNWFLN_SUM;
}

public int getDVNWILN_SUM() {
return DVNWILN_SUM;
}

public byte getEQNEW() {
return EQNEW;
}

public byte getEQNEW_I() {
return EQNEW_I;
}

public boolean getEQNEW_IFLAG() {
return EQNEW_IFLAG;
}

public byte getEQOLD() {
return EQOLD;
}

public byte getEQOLD_I() {
return EQOLD_I;
}

public boolean getEQOLD_IFLAG() {
return EQOLD_IFLAG;
}

public boolean getEQREAS5() {
return EQREAS5;
}

public boolean getEQREAS6() {
return EQREAS6;
}

public boolean getEQREAS7() {
return EQREAS7;
}

public boolean getEQREAS8() {
return EQREAS8;
}

public boolean getEQREAS9() {
return EQREAS9;
}

public byte getHEXT1() {
return HEXT1;
}

public byte getHEXT2() {
return HEXT2;
}

public byte getHEXT3() {
return HEXT3;
}

public byte getHEXT4() {
return HEXT4;
}

public byte getHRPDVAGEW2BAND() {
return HRPDVAGEW2BAND;
}

public boolean getH_FLAG1() {
return H_FLAG1;
}

public boolean getH_FLAG2() {
return H_FLAG2;
}

public byte getH_FLAG4() {
return H_FLAG4;
}

public boolean getH_FLAG5() {
return H_FLAG5;
}

public int getMARRSV() {
return MARRSV;
}

public int getMARRSV2() {
return MARRSV2;
}

public short getMARRSV3() {
return MARRSV3;
}

public byte getMCHGE() {
return MCHGE;
}

public byte getMCHGENUM() {
return MCHGENUM;
}

public boolean getMENDV10() {
return MENDV10;
}

public short getMENDV12() {
return MENDV12;
}

public short getMENDV13() {
return MENDV13;
}

public boolean getMENDV14() {
return MENDV14;
}

public boolean getMENDV15() {
return MENDV15;
}

public boolean getMENDV9() {
return MENDV9;
}

public boolean getMENDVB10() {
return MENDVB10;
}

public boolean getMENDVB12() {
return MENDVB12;
}

public boolean getMENDVB13() {
return MENDVB13;
}

public boolean getMENDVB14() {
return MENDVB14;
}

public boolean getMENDVB15() {
return MENDVB15;
}

public boolean getMENDVB9() {
return MENDVB9;
}

public boolean getMENDY10() {
return MENDY10;
}

public boolean getMENDY12() {
return MENDY12;
}

public boolean getMENDY13() {
return MENDY13;
}

public boolean getMENDY14() {
return MENDY14;
}

public boolean getMENDY15() {
return MENDY15;
}

public boolean getMENDY9() {
return MENDY9;
}

public byte getMEND___W2() {
return MEND___W2;
}

public byte getMEXTN() {
return MEXTN;
}

public byte getMEXTRS1() {
return MEXTRS1;
}

public byte getMEXTRS2() {
return MEXTRS2;
}

public byte getMEXTRS3() {
return MEXTRS3;
}

public byte getMEXTRS4() {
return MEXTRS4;
}

public boolean getMEXTRS5() {
return MEXTRS5;
}

public boolean getMEXTRS6() {
return MEXTRS6;
}

public boolean getMEXTRS7() {
return MEXTRS7;
}

public boolean getMEXTRS8() {
return MEXTRS8;
}

public boolean getMEXTRS9() {
return MEXTRS9;
}

public boolean getMINC10() {
return MINC10;
}

public boolean getMINC13() {
return MINC13;
}

public boolean getMINC14() {
return MINC14;
}

public boolean getMINC15() {
return MINC15;
}

public byte getMNUMBN() {
return MNUMBN;
}

public byte getMNUMBN_I() {
return MNUMBN_I;
}

public boolean getMNUMBN_IFLAG() {
return MNUMBN_IFLAG;
}

public byte getMNUMBO() {
return MNUMBO;
}

public byte getMNUMBO_I() {
return MNUMBO_I;
}

public boolean getMNUMBO_IFLAG() {
return MNUMBO_IFLAG;
}

public byte getMORTID() {
return MORTID;
}

public boolean getMORTID2() {
return MORTID2;
}

public boolean getMORTID3() {
return MORTID3;
}

public byte getMREAS14() {
return MREAS14;
}

public boolean getMREAS15() {
return MREAS15;
}

public byte getMREAS24() {
return MREAS24;
}

public byte getMVALB2_I() {
return MVALB2_I;
}

public boolean getMVALB2_IFLAG() {
return MVALB2_IFLAG;
}

public byte getMW1CHK1() {
return MW1CHK1;
}

public byte getMW1CHK2() {
return MW1CHK2;
}

public byte getMW1CHK3() {
return MW1CHK3;
}

public byte getMYIFCH() {
return MYIFCH;
}

public byte getMYIFCH2() {
return MYIFCH2;
}

public byte getMYIFCH3() {
return MYIFCH3;
}

public byte getNOUNITS() {
return NOUNITS;
}

public byte getNUMDEPCH_HH() {
return NUMDEPCH_HH;
}

public boolean getNUMNDEP() {
return NUMNDEP;
}

public byte getVCADD() {
return VCADD;
}

public byte getVCADDN() {
return VCADDN;
}

public byte getVPERS_I() {
return VPERS_I;
}

public boolean getVPERS_IFLAG() {
return VPERS_IFLAG;
}

protected double XS_CALWGT() {
return XS_CALWGT;
}

public WIGB_WaAS_Wave2_HHOLD_Record(String line) {
s = line.split("\t");
initH_FLAG1(s[0]);
initH_FLAG2(s[1]);
initH_FLAG4(s[2]);
initH_FLAG5(s[3]);
initXS_CALWGT(s[4]);
initHOUT(s[5]);
initACCOM(s[6]);
initACCOTH(s[7]);
initDVVESTV2_I(s[8]);
initDVVESTV2_IFLAG(s[9]);
initDVVESTV3_I(s[10]);
initDVVESTV3_IFLAG(s[11]);
initDVVESTV_I(s[12]);
initDVVESTV_IFLAG(s[13]);
initDVVOVAL_I(s[14]);
initDVVOVAL_IFLAG(s[15]);
initDVVPERV_I(s[16]);
initDVVPERV_IFLAG(s[17]);
initEINTPAY(s[18]);
initEINTRAT(s[19]);
initEINTRAT_I(s[20]);
initEINTRAT_IFLAG(s[21]);
initEOTHIRR(s[22]);
initEOTHIVA(s[23]);
initEOTHIVB(s[24]);
initEOTHREG(s[25]);
initEOTHRVA(s[26]);
initEOTHRVB(s[27]);
initEPRPER(s[28]);
initEPRVAL(s[29]);
initEPRVPAY(s[30]);
initEQFILTER(s[31]);
initEQNEW(s[32]);
initEQNEW_I(s[33]);
initEQNEW_IFLAG(s[34]);
initEQOLD(s[35]);
initEQOLD_I(s[36]);
initEQOLD_IFLAG(s[37]);
initEQREAS1(s[38]);
initEQREAS2(s[39]);
initEQREAS3(s[40]);
initEQREAS4(s[41]);
initEQREAS5(s[42]);
initEQREAS6(s[43]);
initEQREAS7(s[44]);
initEQREAS8(s[45]);
initEQREAS9(s[46]);
initEQREL(s[47]);
initEQREL_I(s[48]);
initEQREL_IFLAG(s[49]);
initEQTYPE(s[50]);
initEQTYPE_I(s[51]);
initEQTYPE_IFLAG(s[52]);
initEQVALB(s[53]);
initEQVAL(s[54]);
initEQVAL_I(s[55]);
initEQVAL_IFLAG(s[56]);
initEQWHEN(s[57]);
initEQYES(s[58]);
initEQYES_I(s[59]);
initEQYES_IFLAG(s[60]);
initERECMB(s[61]);
initERECM(s[62]);
initERECTAX(s[63]);
initERENTAM(s[64]);
initERENTB(s[65]);
initERVPRP(s[66]);
initERVPRP_I(s[67]);
initERVPRP_IFLAG(s[68]);
initERVRECB(s[69]);
initERVREC(s[70]);
initERVREG(s[71]);
initERVRENT(s[72]);
initERVSUMB(s[73]);
initERVSUM(s[74]);
initERVTAX(s[75]);
initFLTTYP(s[76]);
initFURN(s[77]);
initGCOLLEC(s[78]);
initGCOLLEC_I(s[79]);
initGCOLLEC_IFLAG(s[80]);
initGCOLLVB(s[81]);
initGCOLLV(s[82]);
initGCOLLV_I(s[83]);
initGCOLLV_IFLAG(s[84]);
initGCONTVB(s[85]);
initGCONTVB_I(s[86]);
initGCONTVB_IFLAG(s[87]);
initGCONTVLS2(s[88]);
initGCPREAM(s[89]);
initHAGEB(s[90]);
initHAGEYR(s[91]);
initHBFROM(s[92]);
initHBUYSE(s[93]);
initHBUYYR(s[94]);
initHEXT1(s[95]);
initHEXT2(s[96]);
initHEXT3(s[97]);
initHEXT4(s[98]);
initHHOSCH(s[99]);
initHHOWN(s[100]);
initHMORTG(s[101]);
initHPHYSW(s[102]);
initHPRICEB(s[103]);
initHPRICE(s[104]);
initHRTBEV(s[105]);
initHSETYPE(s[106]);
initHSHAREP(s[107]);
initHSHAREP_I(s[108]);
initHSHAREP_IFLAG(s[109]);
initHSHARE(s[110]);
initHSHARE_I(s[111]);
initHSHARE_IFLAG(s[112]);
initHVALB(s[113]);
initHVALRS1(s[114]);
initHVALRS2(s[115]);
initHVALRS3(s[116]);
initHVALRS4(s[117]);
initHVALRS5(s[118]);
initHVALUE(s[119]);
initHVALUE_I(s[120]);
initHVALUE_IFLAG(s[121]);
initLLORD(s[122]);
initMALL2(s[123]);
initMALL2_I(s[124]);
initMALL2_IFLAG(s[125]);
initMALL3(s[126]);
initMALL3_I(s[127]);
initMALL3_IFLAG(s[128]);
initMALLTY2(s[129]);
initMALLTY2_I(s[130]);
initMALLTY2_IFLAG(s[131]);
initMALLTY3(s[132]);
initMALLTY3_I(s[133]);
initMALLTY3_IFLAG(s[134]);
initMALLTY(s[135]);
initMALLTY_I(s[136]);
initMALLTY_IFLAG(s[137]);
initMALL(s[138]);
initMALL_I(s[139]);
initMALL_IFLAG(s[140]);
initMARRS2(s[141]);
initMARRS3(s[142]);
initMARRSV2(s[143]);
initMARRSV3(s[144]);
initMARRSV(s[145]);
initMARRS(s[146]);
initMCHGENUM(s[147]);
initMCHGE(s[148]);
initMDIFFPY(s[149]);
initMENDNUM2(s[150]);
initMENDNUM2_I(s[151]);
initMENDNUM2_IFLAG(s[152]);
initMENDNUM3(s[153]);
initMENDNUM(s[154]);
initMENDNUM_I(s[155]);
initMENDNUM_IFLAG(s[156]);
initMENDV10(s[157]);
initMENDV11(s[158]);
initMENDV12(s[159]);
initMENDV13(s[160]);
initMENDV14(s[161]);
initMENDV15(s[162]);
initMENDV2(s[163]);
initMENDV2_I(s[164]);
initMENDV2_IFLAG(s[165]);
initMENDV3(s[166]);
initMENDV3_I(s[167]);
initMENDV3_IFLAG(s[168]);
initMENDV4(s[169]);
initMENDV4_I(s[170]);
initMENDV4_IFLAG(s[171]);
initMENDV5(s[172]);
initMENDV6(s[173]);
initMENDV6_I(s[174]);
initMENDV6_IFLAG(s[175]);
initMENDV7(s[176]);
initMENDV8(s[177]);
initMENDV9(s[178]);
initMENDVB10(s[179]);
initMENDVB11(s[180]);
initMENDVB12(s[181]);
initMENDVB13(s[182]);
initMENDVB14(s[183]);
initMENDVB15(s[184]);
initMENDVB2(s[185]);
initMENDVB3(s[186]);
initMENDVB4(s[187]);
initMENDVB5(s[188]);
initMENDVB6(s[189]);
initMENDVB7(s[190]);
initMENDVB8(s[191]);
initMENDVB9(s[192]);
initMENDVB(s[193]);
initMENDV(s[194]);
initMENDV_I(s[195]);
initMENDV_IFLAG(s[196]);
initMEND___W2(s[197]);
initMENDW2_I(s[198]);
initMENDW2_IFLAG(s[199]);
initMENDW3(s[200]);
initMENDW3_I(s[201]);
initMENDW3_IFLAG(s[202]);
initMENDW(s[203]);
initMENDW_I(s[204]);
initMENDW_IFLAG(s[205]);
initMENDX2(s[206]);
initMENDX3(s[207]);
initMENDX(s[208]);
initMENDY10(s[209]);
initMENDY11(s[210]);
initMENDY12(s[211]);
initMENDY13(s[212]);
initMENDY14(s[213]);
initMENDY15(s[214]);
initMENDY2(s[215]);
initMENDY3(s[216]);
initMENDY4(s[217]);
initMENDY5(s[218]);
initMENDY6(s[219]);
initMENDY7(s[220]);
initMENDY8(s[221]);
initMENDY9(s[222]);
initMENDY(s[223]);
initMEXTN(s[224]);
initMEXTRS1(s[225]);
initMEXTRS2(s[226]);
initMEXTRS3(s[227]);
initMEXTRS4(s[228]);
initMEXTRS5(s[229]);
initMEXTRS6(s[230]);
initMEXTRS7(s[231]);
initMEXTRS8(s[232]);
initMEXTRS9(s[233]);
initMHOWPY2(s[234]);
initMHOWPY3(s[235]);
initMHOWPY(s[236]);
initMINC10(s[237]);
initMINC11(s[238]);
initMINC12(s[239]);
initMINC13(s[240]);
initMINC14(s[241]);
initMINC15(s[242]);
initMINC1(s[243]);
initMINC2(s[244]);
initMINC3(s[245]);
initMINC4(s[246]);
initMINC5(s[247]);
initMINC6(s[248]);
initMINC7(s[249]);
initMINC8(s[250]);
initMINC9(s[251]);
initMJNAME01(s[252]);
initMJNAME02(s[253]);
initMJNAME03(s[254]);
initMJNAME04(s[255]);
initMJNAME18(s[256]);
initMJNAME19(s[257]);
initMJNAME20(s[258]);
initMJNAME35(s[259]);
initMJNAME36(s[260]);
initMNAME2(s[261]);
initMNAME3(s[262]);
initMNAME(s[263]);
initMNEG2(s[264]);
initMNEG2_I(s[265]);
initMNEG2_IFLAG(s[266]);
initMNEG3(s[267]);
initMNEGB2(s[268]);
initMNEGB3(s[269]);
initMNEGB(s[270]);
initMNEG(s[271]);
initMNEG_I(s[272]);
initMNEG_IFLAG(s[273]);
initMNUMBN(s[274]);
initMNUMBN_I(s[275]);
initMNUMBN_IFLAG(s[276]);
initMNUMBO(s[277]);
initMNUMBO_I(s[278]);
initMNUMBO_IFLAG(s[279]);
initMNUMB(s[280]);
initMOARR_SUM(s[281]);
initMONAME2(s[282]);
initMONAME3(s[283]);
initMONAME(s[284]);
initMORTID2(s[285]);
initMORTID3(s[286]);
initMORTID(s[287]);
initMPAYB2(s[288]);
initMPAYB3(s[289]);
initMPAYB(s[290]);
initMPAYM2(s[291]);
initMPAYM3(s[292]);
initMPAYM(s[293]);
initMPP2(s[294]);
initMPP3(s[295]);
initMPP(s[296]);
initMREAS01(s[297]);
initMREAS02(s[298]);
initMREAS03(s[299]);
initMREAS04(s[300]);
initMREAS05(s[301]);
initMREAS06(s[302]);
initMREAS07(s[303]);
initMREAS08(s[304]);
initMREAS09(s[305]);
initMREAS11(s[306]);
initMREAS12(s[307]);
initMREAS13(s[308]);
initMREAS14(s[309]);
initMREAS15(s[310]);
initMREAS21(s[311]);
initMREAS22(s[312]);
initMREAS23(s[313]);
initMREAS24(s[314]);
initMTYPE2(s[315]);
initMTYPE2_I(s[316]);
initMTYPE2_IFLAG(s[317]);
initMTYPE3(s[318]);
initMTYPE3_I(s[319]);
initMTYPE3_IFLAG(s[320]);
initMTYPE(s[321]);
initMTYPE_I(s[322]);
initMTYPE_IFLAG(s[323]);
initMVAL2(s[324]);
initMVAL2_I(s[325]);
initMVAL2_IFLAG(s[326]);
initMVAL3(s[327]);
initMVAL3_I(s[328]);
initMVAL3_IFLAG(s[329]);
initMVALB2(s[330]);
initMVALB2_I(s[331]);
initMVALB2_IFLAG(s[332]);
initMVALB3(s[333]);
initMVALB(s[334]);
initMVAL(s[335]);
initMVAL_I(s[336]);
initMVAL_IFLAG(s[337]);
initMW1CHK1(s[338]);
initMW1CHK2(s[339]);
initMW1CHK3(s[340]);
initMYIFCH2(s[341]);
initMYIFCH3(s[342]);
initMYIFCH(s[343]);
initMYLFT2(s[344]);
initMYLFT3(s[345]);
initMYLFT(s[346]);
initNVESTV(s[347]);
initOFINAL(s[348]);
initOTHMORT(s[349]);
initTEN1(s[350]);
initTEN1_I(s[351]);
initTEN1_IFLAG(s[352]);
initTIED(s[353]);
initVCADDN(s[354]);
initVCADD(s[355]);
initVCARN(s[356]);
initVCARN_I(s[357]);
initVCARN_IFLAG(s[358]);
initVESTV2(s[359]);
initVESTV2_I(s[360]);
initVESTV2_IFLAG(s[361]);
initVESTV(s[362]);
initVESTV_I(s[363]);
initVESTV_IFLAG(s[364]);
initVESVB2(s[365]);
initVESVB(s[366]);
initVOTHT(s[367]);
initVOTHT_I(s[368]);
initVOTHT_IFLAG(s[369]);
initVOTYP1(s[370]);
initVOTYP1_IFLAG(s[371]);
initVOTYP2(s[372]);
initVOTYP2_IFLAG(s[373]);
initVOTYP3(s[374]);
initVOTYP3_IFLAG(s[375]);
initVOTYP4(s[376]);
initVOTYP4_IFLAG(s[377]);
initVOTYP5(s[378]);
initVOTYP5_IFLAG(s[379]);
initVOVAL(s[380]);
initVOVAL_I(s[381]);
initVOVAL_IFLAG(s[382]);
initVOVLB(s[383]);
initVOVLB_I(s[384]);
initVOVLB_IFLAG(s[385]);
initVPERS(s[386]);
initVPERS_I(s[387]);
initVPERS_IFLAG(s[388]);
initVPERV(s[389]);
initVPERV_I(s[390]);
initVPERV_IFLAG(s[391]);
initVTYPE2(s[392]);
initVTYPE2_I(s[393]);
initVTYPE2_IFLAG(s[394]);
initVTYPE(s[395]);
initVTYPE_I(s[396]);
initVTYPE_IFLAG(s[397]);
initALLENDW(s[398]);
initALLGD(s[399]);
initBUYLGDST_SUM(s[400]);
initDVBLDDEBT(s[401]);
initDVBLDVAL(s[402]);
initDVBLTDEBT(s[403]);
initDVBLTVAL(s[404]);
initDVCACRVAL_SUM(s[405]);
initDVCACTV_SUM(s[406]);
initDVCAODVAL_SUM(s[407]);
initDVCASVV_SUM(s[408]);
initDVCAVAL_SUM(s[409]);
initDVCISAV_SUM(s[410]);
initDVDBRWEALTHVAL_SUM(s[411]);
initDVEQHIP(s[412]);
initDVEQRELVAL(s[413]);
initDVEQRUPM(s[414]);
initDVFBONDV_SUM(s[415]);
initDVFCOLLV_SUM(s[416]);
initDVFESHARES_SUM(s[417]);
initDVFFASSETS_SUM(s[418]);
initDVFGLTFOV_SUM(s[419]);
initDVFGLTUKV_SUM(s[420]);
initDVFINFLV_SUM(s[421]);
initDVFINFVAL_SUM(s[422]);
initDVFINFV_SUM(s[423]);
initDVFINVOTV_SUM(s[424]);
initDVFNSVAL_SUM(s[425]);
initDVFSHOSV_SUM(s[426]);
initDVFSHUKV_SUM(s[427]);
initDVGCOLLV(s[428]);
initDVHORP(s[429]);
initDVHSEDEBT(s[430]);
initDVHSEVAL(s[431]);
initDVHVALUE(s[432]);
initDVIISAV_SUM(s[433]);
initDVINSV_SUM(s[434]);
initDVISAVAL_SUM(s[435]);
initDVKISAV_SUM(s[436]);
initDVLOSDEBT(s[437]);
initDVLOSVAL(s[438]);
initDVLUKDEBT(s[439]);
initDVLUKVAL(s[440]);
initDVNWFLN_SUM(s[441]);
initDVNWILN_SUM(s[442]);
initDVOPRDEBT(s[443]);
initDVOPRVAL(s[444]);
initDVPAVCUV_SUM(s[445]);
initDVPFCURVAL_SUM(s[446]);
initDVPFDDV_SUM(s[447]);
initDVPINPVAL_SUM(s[448]);
initDVPPVAL_SUM(s[449]);
initDVPRIRNT(s[450]);
initDVPROPERTY(s[451]);
initDVSAVAL_SUM(s[452]);
initDVSPEN_SUM(s[453]);
initDVTOTCARVAL(s[454]);
initDVTOTMOTBVAL(s[455]);
initDVTOTOTHVEHVAL(s[456]);
initDVTOTPERNPVAL(s[457]);
initDVTOTVANVAL(s[458]);
initDVTOTVEHVAL(s[459]);
initDVVALDBT_SUM(s[460]);
initDVVALDCOS_SUM(s[461]);
initHFINL_SUM(s[462]);
initHFINW_EXCENDW_SUM(s[463]);
initHFINWNT_SUM(s[464]);
initHFINW_SUM(s[465]);
initHOUSGDST_SUM(s[466]);
initHPARR_SUM(s[467]);
initHPROPW(s[468]);
initLNARR_SUM(s[469]);
initT_FLNS_SUM(s[470]);
initT_LNS_SUM(s[471]);
initT_SLNS_SUM(s[472]);
initTOTBILLARR_SUM(s[473]);
initTOTCC_SUM(s[474]);
initTOTHP_SUM(s[475]);
initTOTLOS_SUM(s[476]);
initTOTMNEG(s[477]);
initTOTMORT(s[478]);
initTOTMO_SUM(s[479]);
initTOTMVAL(s[480]);
initTOTPEN_SUM(s[481]);
initTOTSC_SUM(s[482]);
initTOTWLTH(s[483]);
initDVHRPNUM(s[484]);
initDVHSIZE(s[485]);
initHHOLDTYPE(s[486]);
initHRPDVAGE9(s[487]);
initHRPDVILO3A(s[488]);
initHRPDVMRDF(s[489]);
initHRPEDATTN1(s[490]);
initHRPEDATTN2(s[491]);
initHRPEDATTN3(s[492]);
initHRPEDLEVEL(s[493]);
initHRPEMPSTAT2(s[494]);
initHRPIOUT1(s[495]);
initHRPNSSEC3(s[496]);
initHRPPARTIOUT1(s[497]);
initHRPPART(s[498]);
initHRPSEX(s[499]);
initNBABY(s[500]);
initNC1015(s[501]);
initNC1618(s[502]);
initNC5TO9(s[503]);
initNCHILD(s[504]);
initNCU16(s[505]);
initNCUND5(s[506]);
initNDEPC(s[507]);
initNNDEPC(s[508]);
initNOUNITS(s[509]);
initNUMADULT(s[510]);
initNUMCH18(s[511]);
initNUMCHILD(s[512]);
initNUMCIVPTR(s[513]);
initNUMCPART(s[514]);
initNUMDEPCH_HH(s[515]);
initNUMHHLDR(s[516]);
initNUMJOB(s[517]);
initNUMMPART(s[518]);
initNUMNDEP(s[519]);
initNUMSSEX(s[520]);
initVESTV3_IFLAG(s[521]);
initVESVB3(s[522]);
initVESTV3(s[523]);
initVESTV3_I(s[524]);
initHRPDVAGE15(s[525]);
initHBEDRM(s[526]);
initVOTYP1_I(s[527]);
initVOTYP2_I(s[528]);
initVOTYP3_I(s[529]);
initVOTYP4_I(s[530]);
initVOTYP5_I(s[531]);
initCASEW2(s[532]);
initCASEW1(s[533]);
initHRPDVAGEW2BAND(s[534]);
initGOR(s[535]);
initYEAR(s[536]);
initMONTH(s[537]);
}
}
