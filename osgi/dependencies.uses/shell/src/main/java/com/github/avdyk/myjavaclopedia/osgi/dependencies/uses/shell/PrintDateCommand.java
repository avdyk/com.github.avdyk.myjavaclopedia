package com.github.avdyk.myjavaclopedia.osgi.dependencies.uses.shell;

import com.github.avdyk.myjavaclopedia.osgi.dependencies.uses.api.LocalDatePrinter;
import org.apache.karaf.shell.api.console.Command;
import org.apache.karaf.shell.api.console.Completer;
import org.apache.karaf.shell.api.console.Parser;
import org.apache.karaf.shell.api.console.Session;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Shell command to print the current date.
 *
 * @author <a href="mailto:arnaud.vandyck@staff.voo.be">Arnaud Vandyck</a>
 * @since 1.0.0, 19.11.15.
 */
@Named("localDatePrinterService")
public class PrintDateCommand implements Command {

    private final LocalDatePrinter localDatePrinterService;

    @Inject
    public PrintDateCommand(final LocalDatePrinter localDatePrinterService) {
        this.localDatePrinterService = localDatePrinterService;
    }

    @Override
    public String getScope() {
        return Session.SCOPE_GLOBAL;
    }

    @Override
    public String getName() {
        return "now";
    }

    @Override
    public String getDescription() {
        return "Print the current date";
    }

    @Override
    public Completer getCompleter(boolean b) {
        return null;
    }

    @Override
    public Parser getParser() {
        return null;
    }

    @Override
    public Object execute(Session session, List<Object> list) throws Exception {
        return localDatePrinterService.print(localDatePrinterService.now());
    }
}
