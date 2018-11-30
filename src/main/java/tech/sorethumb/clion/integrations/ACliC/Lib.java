package tech.sorethumb.clion.integrations.ACliC;

import tech.sorethumb.clion.integrations.CommandLine;

public class Lib extends CommandLine{
    
    /**
     * Shows a list of all installed libraries.
     * @return
     */
    public static String getInstalledLibraries()
    {
        
        ProcessBuilder builder =
                new ProcessBuilder(Constants.asString(),
                        Constants.LIST);
        return ExecuteCommandLine(builder);
    }
    
    /**
     * Include built-in libraries (from platforms and IDE) in listing.
     * @return
     */
    public static String getAllInstalledLibraries()
    {
        
        ProcessBuilder builder =
                new ProcessBuilder(Constants.asString(),
                        Constants.LIST,
                        "all");
        return ExecuteCommandLine(builder);
    }
    
    /**
     * List updatable libraries.
     * @return
     */
    public static String getUpdatableLibraries()
    {
        ProcessBuilder builder =
                new ProcessBuilder(Constants.asString(),
                        Constants.LIST,
                        "--updatable");
        return ExecuteCommandLine(builder);
    }
    
    /**
     * Arduino commands about libraries
     */
    public static class Constants {
        
        /**
         * Arduino commands about libraries
         */
        public static final String LIB = "lib";
        
        @Override
        public String toString () {
            return LIB;
        }
        
        public static String asString () {
            return LIB;
        }
        
        /**
         * Downloads one or more libraries without installing them.
         */
        public static final String DOWNLOAD = "download";
        
        /**
         * Installs one of more specified libraries into the system.
         */
        public static final String INSTALL = "install";
        
        /**
         * Shows a list of all installed libraries.
         */
        public static final String LIST = "list";
        
        /**
         * Searchs for one or more libraries data.
         */
        public static final String SEARCH = "search";
        
        /**
         * Uninstalls one or more libraries.
         */
        public static final String UNINSTALL = "uninstall";
        
        /**
         * Updates the libraries index.
         */
        public static final String UPDATE_INDEX = "update-index";
        
        /**
         * Upgrades installed libraries.
         */
        public static final String UPGRADE = "upgrade";
        
        
    }
}
