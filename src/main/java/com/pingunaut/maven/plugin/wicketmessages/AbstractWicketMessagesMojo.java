package com.pingunaut.maven.plugin.wicketmessages;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * The Class AbstractWicketMessagesMojo.
 *
 * @author martin spielmann
 */
public abstract class AbstractWicketMessagesMojo extends AbstractMojo {

    @Parameter(defaultValue = ".properties.xml", property = "fileExtension", required = true)
    protected String fileExtension;

    @Parameter(defaultValue = "${project.basedir}", property = "basedir", required = true)
    protected String basedir;

    @Parameter(defaultValue = "false", property = "append", required = true)
    protected boolean append;

    /**
     * The Constant DEFAULT_LOCALE is defined for wicket's default message files which do not have any locale identifier.
     */
    protected static final Locale DEFAULT_LOCALE = new Locale("default");


    /**
     * Base path.
     *
     * @return the path
     */
    protected Path basePath() {
        return Paths.get(basedir);
    }
}