package uk.ac.leeds.ccg.andyt.projects.ukhi.core;

import uk.ac.leeds.ccg.andyt.generic.memory.Generic_OutOfMemoryErrorHandler;

/**
 *
 * @author Andy Turner
 */
public abstract class UKHI_OutOfMemoryErrorHandler extends Generic_OutOfMemoryErrorHandler {

    //static final long serialVersionUID = 1L;
    //public static long Memory_Threshold = 3000000000L;
    public static long Memory_Threshold = 2000000000L;

    @Override
    public boolean swapDataAny() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean swapDataAny(boolean handleOutOfMemoryError) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkAndMaybeFreeMemory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}