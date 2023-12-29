import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloIntelliJAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        Messages.showInfoMessage("Hello World!", "Hello IntelliJ!")
    }
}
