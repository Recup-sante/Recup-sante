import {ComponentFixture, TestBed} from '@angular/core/testing';
import {LoginComponent} from './login';
import {AuthService} from '../../services/auth.service';
import {Router} from '@angular/router';
import {of, throwError} from 'rxjs';

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;
  let mockAuthService: any;
  let mockRouter: any;

  beforeEach(async () => {
    mockAuthService = {
      login: vi.fn()
    };
    mockRouter = {
      navigateByUrl: vi.fn()
    };

    await TestBed.configureTestingModule({
      declarations: [LoginComponent],
      providers: [
        { provide: AuthService, useValue: mockAuthService },
        { provide: Router, useValue: mockRouter }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
  });

  test('should login and navigate', () => {
    mockAuthService.login.mockReturnValue(of({ user: { id: 1, name: 'Test', email: 't@t.com' } }));
    component.username = 'test';
    component.password = 'pass';
    component.onSubmit();

    expect(mockAuthService.login).toHaveBeenCalledWith('test', 'pass');
    expect(mockRouter.navigateByUrl).toHaveBeenCalledWith('/');
  });

  test('should handle login error', () => {
    const errorResponse = new Error('Login failed');
    mockAuthService.login.mockReturnValue(throwError(() => errorResponse));

    component.onSubmit();

    expect(mockAuthService.login).toHaveBeenCalled();
  });
});
