package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

//Singleton
public class PushPanel extends Command
{
    private boolean push;
    public PushPanel(boolean push)
    {
        requires(Robot.m_PanelSubsystem);
        this.push = push;
    }
    protected void execute()
    {
        // //TODO: REMOVE THIS LINE AFTER DEBUG
        // System.out.println("push = " + push);
        Robot.m_PanelSubsystem.push(push);
    }
    @Override
    protected boolean isFinished() {
        return //Robot.m_PanelSubsystem.pushCheck() == push;
        true;
    }
    
}