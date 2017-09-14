package org.apache.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Hello world!
 *
 */
@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

//    Mojo的参数，可以在使用插件的项目中配置
    @Parameter(property = "test.word.test", defaultValue = "nothing")
    private String word;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello word.");
        getLog().info(this.word);
    }
}
